/*
 * dex2jar - Tools to work with android .dex and java .class files
 * Copyright (c) 2009-2013 Panxiaobo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.d2j.dex.writer.ev;

import com.googlecode.d2j.dex.writer.ann.Idx;
import com.googlecode.d2j.dex.writer.io.DataOut;
import com.googlecode.d2j.dex.writer.item.BaseItem;
import com.googlecode.d2j.dex.writer.item.StringIdItem;
import com.googlecode.d2j.dex.writer.item.TypeIdItem;

import java.util.ArrayList;
import java.util.List;

public class EncodedAnnotation implements Comparable<EncodedAnnotation> {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EncodedAnnotation that = (EncodedAnnotation) o;

        if (!elements.equals(that.elements)) return false;
        if (!type.equals(that.type)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = type.hashCode();
        result = 31 * result + elements.hashCode();
        return result;
    }

    @Override
    public int compareTo(EncodedAnnotation o) {
        if (o == null) {
            return 1;
        }

        int x = type.compareTo(o.type);
        if (x != 0) {
            return x;
        }
        x = Integer.compare(elements.size(), o.elements.size());
        if (x != 0) {
            return x;
        }
        for (int i = 0; i < elements.size(); i++) {
            AnnotationElement a = elements.get(i);
            AnnotationElement b = o.elements.get(i);

            x = a.compareTo(b);
            if (x != 0) {
                return x;
            }
        }
        return 0;
    }

    public static class AnnotationElement implements Comparable<AnnotationElement> {
        public StringIdItem name;
        public EncodedValue value;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AnnotationElement that = (AnnotationElement) o;

            if (!name.equals(that.name)) return false;
            if (!value.equals(that.value)) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = name.hashCode();
            result = 31 * result + value.hashCode();
            return result;
        }

        @Override
        public int compareTo(AnnotationElement o) {
            if (o == null) {
                return 1;
            }
            int x = name.compareTo(o.name);
            if (x != 0) {
                return x;
            }
            return value.compareTo(o.value);
        }
    }

    @Idx
    public TypeIdItem type;
    final public List<AnnotationElement> elements = new ArrayList<>(5);

    public int place(int offset) {
        offset += BaseItem.lengthOfUleb128(type.index);
        offset += BaseItem.lengthOfUleb128(elements.size());
        for (AnnotationElement ae : elements) {
            offset += BaseItem.lengthOfUleb128(ae.name.index);
            offset = ae.value.place(offset);
        }
        return offset;
    }

    public void write(DataOut out) {
        out.uleb128("type_idx", type.index);
        out.uleb128("size", elements.size());
        for (AnnotationElement ae : elements) {
            out.uleb128("name_idx", ae.name.index);
            ae.value.write(out);
        }
    }
}
