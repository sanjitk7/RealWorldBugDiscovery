// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/roots.proto
package com.squareup.wire.protos.roots;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.INT32;

public final class K extends Message {
  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_I = 0;

  @ProtoField(tag = 1, type = INT32)
  public final Integer i;

  public K(Integer i) {
    this.i = i;
  }

  private K(Builder builder) {
    this(builder.i);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof K)) return false;
    return equals(i, ((K) other).i);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = i != null ? i.hashCode() : 0);
  }

  public static final class Builder extends Message.Builder<K> {

    public Integer i;

    public Builder() {
    }

    public Builder(K message) {
      super(message);
      if (message == null) return;
      this.i = message.i;
    }

    public Builder i(Integer i) {
      this.i = i;
      return this;
    }

    @Override
    public K build() {
      return new K(this);
    }
  }
}
