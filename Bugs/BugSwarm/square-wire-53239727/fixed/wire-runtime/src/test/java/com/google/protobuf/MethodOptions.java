// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/google/protobuf/descriptor.proto
package com.google.protobuf;

import com.squareup.wire.ExtendableMessage;
import com.squareup.wire.Extension;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Label.REPEATED;

public final class MethodOptions extends ExtendableMessage<MethodOptions> {
  private static final long serialVersionUID = 0L;

  public static final List<UninterpretedOption> DEFAULT_UNINTERPRETED_OPTION = Collections.emptyList();

  /**
   * Note:  Field numbers 1 through 32 are reserved for Google's internal RPC
   *   framework.  We apologize for hoarding these numbers to ourselves, but
   *   we were already using them long before we decided to release Protocol
   *   Buffers.
   * The parser stores options it doesn't recognize here. See above.
   */
  @ProtoField(tag = 999, label = REPEATED, messageType = UninterpretedOption.class)
  public final List<UninterpretedOption> uninterpreted_option;

  public MethodOptions(List<UninterpretedOption> uninterpreted_option) {
    this.uninterpreted_option = immutableCopyOf(uninterpreted_option);
  }

  private MethodOptions(Builder builder) {
    this(builder.uninterpreted_option);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof MethodOptions)) return false;
    MethodOptions o = (MethodOptions) other;
    if (!extensionsEqual(o)) return false;
    return equals(uninterpreted_option, o.uninterpreted_option);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = extensionsHashCode();
      result = result * 37 + (uninterpreted_option != null ? uninterpreted_option.hashCode() : 1);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends ExtendableBuilder<MethodOptions> {

    public List<UninterpretedOption> uninterpreted_option;

    public Builder() {
    }

    public Builder(MethodOptions message) {
      super(message);
      if (message == null) return;
      this.uninterpreted_option = copyOf(message.uninterpreted_option);
    }

    /**
     * Note:  Field numbers 1 through 32 are reserved for Google's internal RPC
     *   framework.  We apologize for hoarding these numbers to ourselves, but
     *   we were already using them long before we decided to release Protocol
     *   Buffers.
     * The parser stores options it doesn't recognize here. See above.
     */
    public Builder uninterpreted_option(List<UninterpretedOption> uninterpreted_option) {
      this.uninterpreted_option = checkForNulls(uninterpreted_option);
      return this;
    }

    @Override
    public <E> Builder setExtension(Extension<MethodOptions, E> extension, E value) {
      super.setExtension(extension, value);
      return this;
    }

    @Override
    public MethodOptions build() {
      return new MethodOptions(this);
    }
  }
}
