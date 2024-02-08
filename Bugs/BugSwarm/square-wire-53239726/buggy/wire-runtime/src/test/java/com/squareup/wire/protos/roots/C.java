// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/roots.proto
package com.squareup.wire.protos.roots;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.INT32;

public final class C extends Message {

  public static final Integer DEFAULT_I = 0;

  @ProtoField(tag = 1, type = INT32)
  public final Integer i;

  public C(Integer i) {
    this.i = i;
  }

  private C(Builder builder) {
    this(builder.i);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof C)) return false;
    return equals(i, ((C) other).i);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = i != null ? i.hashCode() : 0);
  }

  public static final class Builder extends Message.Builder<C> {

    public Integer i;

    public Builder() {
    }

    public Builder(C message) {
      super(message);
      if (message == null) return;
      this.i = message.i;
    }

    public Builder i(Integer i) {
      this.i = i;
      return this;
    }

    @Override
    public C build() {
      return new C(this);
    }
  }
}
