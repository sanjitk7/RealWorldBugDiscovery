// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/roots.proto
package com.squareup.wire.protos.roots;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class H extends Message {
  private static final long serialVersionUID = 0L;

  @ProtoField(tag = 1)
  public final E.F ef;

  public H(E.F ef) {
    this.ef = ef;
  }

  private H(Builder builder) {
    this(builder.ef);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof H)) return false;
    return equals(ef, ((H) other).ef);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = ef != null ? ef.hashCode() : 0);
  }

  public static final class Builder extends Message.Builder<H> {

    public E.F ef;

    public Builder() {
    }

    public Builder(H message) {
      super(message);
      if (message == null) return;
      this.ef = message.ef;
    }

    public Builder ef(E.F ef) {
      this.ef = ef;
      return this;
    }

    @Override
    public H build() {
      return new H(this);
    }
  }
}
