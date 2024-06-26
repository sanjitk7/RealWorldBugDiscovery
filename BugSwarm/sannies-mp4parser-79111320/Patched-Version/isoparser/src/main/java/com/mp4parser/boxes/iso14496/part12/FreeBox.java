/*  
 * Copyright 2008 CoreMedia AG, Hamburg
 *
 * Licensed under the Apache License, Version 2.0 (the License); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an AS IS BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 */

package com.mp4parser.boxes.iso14496.part12;


import com.mp4parser.BoxParser;
import com.mp4parser.Container;
import com.mp4parser.ParsableBox;
import com.mp4parser.tools.IsoTypeWriter;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.LinkedList;
import java.util.List;

import static com.mp4parser.tools.CastUtils.l2i;

/**
 * <h1>4cc = "{@value #TYPE}"</h1>
 * A free box. Just a placeholder to enable editing without rewriting the whole file.
 */
public class FreeBox implements ParsableBox {
    public static final String TYPE = "free";
    ByteBuffer data;
    List<ParsableBox> replacers = new LinkedList<ParsableBox>();
    private Container parent;
    private long offset;

    public FreeBox() {
        this.data = ByteBuffer.wrap(new byte[0]);
    }

    public FreeBox(int size) {
        this.data = ByteBuffer.allocate(size);
    }
    public ByteBuffer getData() {
        if (data != null) {
            return (ByteBuffer) data.duplicate().rewind();
        } else {
            return null;
        }
    }

    public void setData(ByteBuffer data) {
        this.data = data;
    }

    public void getBox(WritableByteChannel os) throws IOException {
        for (ParsableBox replacer : replacers) {
            replacer.getBox(os);
        }
        ByteBuffer header = ByteBuffer.allocate(8);
        IsoTypeWriter.writeUInt32(header, 8 + data.limit());
        header.put(TYPE.getBytes());
        header.rewind();
        os.write(header);
        header.rewind();
        data.rewind();
        os.write(data);
        data.rewind();

    }

    public long getSize() {
        long size = 8;
        for (ParsableBox replacer : replacers) {
            size += replacer.getSize();
        }
        size += data.limit();
        return size;
    }

    public String getType() {
        return TYPE;
    }

    public void parse(ReadableByteChannel dataSource, ByteBuffer header, long contentSize, BoxParser boxParser) throws IOException {
        data = ByteBuffer.allocate(l2i(contentSize));

        int bytesRead = 0;
        int b;
        while (((((b = dataSource.read(data))) + bytesRead) < contentSize)) {
            bytesRead += b;
        }
    }


    public void addAndReplace(ParsableBox parsableBox) {
        data.position(l2i(parsableBox.getSize()));
        data = data.slice();
        replacers.add(parsableBox);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FreeBox freeBox = (FreeBox) o;

        if (getData() != null ? !getData().equals(freeBox.getData()) : freeBox.getData() != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return data != null ? data.hashCode() : 0;
    }
}