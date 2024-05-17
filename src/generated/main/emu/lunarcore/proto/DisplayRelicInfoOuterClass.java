// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedMessage;

public final class DisplayRelicInfoOuterClass {
  /**
   * Protobuf type {@code DisplayRelicInfo}
   */
  public static final class DisplayRelicInfo extends ProtoMessage<DisplayRelicInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 exp = 1;</code>
     */
    private int exp;

    /**
     * <code>optional uint32 slot = 2;</code>
     */
    private int slot;

    /**
     * <code>optional uint32 main_affix_id = 6;</code>
     */
    private int mainAffixId;

    /**
     * <code>optional uint32 tid = 8;</code>
     */
    private int tid;

    /**
     * <code>optional uint32 level = 15;</code>
     */
    private int level;

    /**
     * <code>repeated .RelicAffix sub_affix_list = 14;</code>
     */
    private final RepeatedMessage<RelicAffixOuterClass.RelicAffix> subAffixList = RepeatedMessage.newEmptyInstance(RelicAffixOuterClass.RelicAffix.getFactory());

    private DisplayRelicInfo() {
    }

    /**
     * @return a new empty instance of {@code DisplayRelicInfo}
     */
    public static DisplayRelicInfo newInstance() {
      return new DisplayRelicInfo();
    }

    /**
     * <code>optional uint32 exp = 1;</code>
     * @return whether the exp field is set
     */
    public boolean hasExp() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 exp = 1;</code>
     * @return this
     */
    public DisplayRelicInfo clearExp() {
      bitField0_ &= ~0x00000001;
      exp = 0;
      return this;
    }

    /**
     * <code>optional uint32 exp = 1;</code>
     * @return the exp
     */
    public int getExp() {
      return exp;
    }

    /**
     * <code>optional uint32 exp = 1;</code>
     * @param value the exp to set
     * @return this
     */
    public DisplayRelicInfo setExp(final int value) {
      bitField0_ |= 0x00000001;
      exp = value;
      return this;
    }

    /**
     * <code>optional uint32 slot = 2;</code>
     * @return whether the slot field is set
     */
    public boolean hasSlot() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 slot = 2;</code>
     * @return this
     */
    public DisplayRelicInfo clearSlot() {
      bitField0_ &= ~0x00000002;
      slot = 0;
      return this;
    }

    /**
     * <code>optional uint32 slot = 2;</code>
     * @return the slot
     */
    public int getSlot() {
      return slot;
    }

    /**
     * <code>optional uint32 slot = 2;</code>
     * @param value the slot to set
     * @return this
     */
    public DisplayRelicInfo setSlot(final int value) {
      bitField0_ |= 0x00000002;
      slot = value;
      return this;
    }

    /**
     * <code>optional uint32 main_affix_id = 6;</code>
     * @return whether the mainAffixId field is set
     */
    public boolean hasMainAffixId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 main_affix_id = 6;</code>
     * @return this
     */
    public DisplayRelicInfo clearMainAffixId() {
      bitField0_ &= ~0x00000004;
      mainAffixId = 0;
      return this;
    }

    /**
     * <code>optional uint32 main_affix_id = 6;</code>
     * @return the mainAffixId
     */
    public int getMainAffixId() {
      return mainAffixId;
    }

    /**
     * <code>optional uint32 main_affix_id = 6;</code>
     * @param value the mainAffixId to set
     * @return this
     */
    public DisplayRelicInfo setMainAffixId(final int value) {
      bitField0_ |= 0x00000004;
      mainAffixId = value;
      return this;
    }

    /**
     * <code>optional uint32 tid = 8;</code>
     * @return whether the tid field is set
     */
    public boolean hasTid() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 tid = 8;</code>
     * @return this
     */
    public DisplayRelicInfo clearTid() {
      bitField0_ &= ~0x00000008;
      tid = 0;
      return this;
    }

    /**
     * <code>optional uint32 tid = 8;</code>
     * @return the tid
     */
    public int getTid() {
      return tid;
    }

    /**
     * <code>optional uint32 tid = 8;</code>
     * @param value the tid to set
     * @return this
     */
    public DisplayRelicInfo setTid(final int value) {
      bitField0_ |= 0x00000008;
      tid = value;
      return this;
    }

    /**
     * <code>optional uint32 level = 15;</code>
     * @return whether the level field is set
     */
    public boolean hasLevel() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional uint32 level = 15;</code>
     * @return this
     */
    public DisplayRelicInfo clearLevel() {
      bitField0_ &= ~0x00000010;
      level = 0;
      return this;
    }

    /**
     * <code>optional uint32 level = 15;</code>
     * @return the level
     */
    public int getLevel() {
      return level;
    }

    /**
     * <code>optional uint32 level = 15;</code>
     * @param value the level to set
     * @return this
     */
    public DisplayRelicInfo setLevel(final int value) {
      bitField0_ |= 0x00000010;
      level = value;
      return this;
    }

    /**
     * <code>repeated .RelicAffix sub_affix_list = 14;</code>
     * @return whether the subAffixList field is set
     */
    public boolean hasSubAffixList() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>repeated .RelicAffix sub_affix_list = 14;</code>
     * @return this
     */
    public DisplayRelicInfo clearSubAffixList() {
      bitField0_ &= ~0x00000020;
      subAffixList.clear();
      return this;
    }

    /**
     * <code>repeated .RelicAffix sub_affix_list = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableSubAffixList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<RelicAffixOuterClass.RelicAffix> getSubAffixList() {
      return subAffixList;
    }

    /**
     * <code>repeated .RelicAffix sub_affix_list = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<RelicAffixOuterClass.RelicAffix> getMutableSubAffixList() {
      bitField0_ |= 0x00000020;
      return subAffixList;
    }

    /**
     * <code>repeated .RelicAffix sub_affix_list = 14;</code>
     * @param value the subAffixList to add
     * @return this
     */
    public DisplayRelicInfo addSubAffixList(final RelicAffixOuterClass.RelicAffix value) {
      bitField0_ |= 0x00000020;
      subAffixList.add(value);
      return this;
    }

    /**
     * <code>repeated .RelicAffix sub_affix_list = 14;</code>
     * @param values the subAffixList to add
     * @return this
     */
    public DisplayRelicInfo addAllSubAffixList(final RelicAffixOuterClass.RelicAffix... values) {
      bitField0_ |= 0x00000020;
      subAffixList.addAll(values);
      return this;
    }

    @Override
    public DisplayRelicInfo copyFrom(final DisplayRelicInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        exp = other.exp;
        slot = other.slot;
        mainAffixId = other.mainAffixId;
        tid = other.tid;
        level = other.level;
        subAffixList.copyFrom(other.subAffixList);
      }
      return this;
    }

    @Override
    public DisplayRelicInfo mergeFrom(final DisplayRelicInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasExp()) {
        setExp(other.exp);
      }
      if (other.hasSlot()) {
        setSlot(other.slot);
      }
      if (other.hasMainAffixId()) {
        setMainAffixId(other.mainAffixId);
      }
      if (other.hasTid()) {
        setTid(other.tid);
      }
      if (other.hasLevel()) {
        setLevel(other.level);
      }
      if (other.hasSubAffixList()) {
        getMutableSubAffixList().addAll(other.subAffixList);
      }
      return this;
    }

    @Override
    public DisplayRelicInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      exp = 0;
      slot = 0;
      mainAffixId = 0;
      tid = 0;
      level = 0;
      subAffixList.clear();
      return this;
    }

    @Override
    public DisplayRelicInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      subAffixList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof DisplayRelicInfo)) {
        return false;
      }
      DisplayRelicInfo other = (DisplayRelicInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasExp() || exp == other.exp)
        && (!hasSlot() || slot == other.slot)
        && (!hasMainAffixId() || mainAffixId == other.mainAffixId)
        && (!hasTid() || tid == other.tid)
        && (!hasLevel() || level == other.level)
        && (!hasSubAffixList() || subAffixList.equals(other.subAffixList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(exp);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(slot);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(mainAffixId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(tid);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(level);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        for (int i = 0; i < subAffixList.length(); i++) {
          output.writeRawByte((byte) 114);
          output.writeMessageNoTag(subAffixList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(exp);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(slot);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(mainAffixId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(tid);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(level);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += (1 * subAffixList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(subAffixList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public DisplayRelicInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // exp
            exp = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 16) {
              break;
            }
          }
          case 16: {
            // slot
            slot = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // mainAffixId
            mainAffixId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // tid
            tid = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // level
            level = input.readUInt32();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // subAffixList
            tag = input.readRepeatedMessage(subAffixList, tag);
            bitField0_ |= 0x00000020;
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.exp, exp);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.slot, slot);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.mainAffixId, mainAffixId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.tid, tid);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt32(FieldNames.level, level);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRepeatedMessage(FieldNames.subAffixList, subAffixList);
      }
      output.endObject();
    }

    @Override
    public DisplayRelicInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 100893: {
            if (input.isAtField(FieldNames.exp)) {
              if (!input.trySkipNullValue()) {
                exp = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 3533310: {
            if (input.isAtField(FieldNames.slot)) {
              if (!input.trySkipNullValue()) {
                slot = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1973876974:
          case -1426712144: {
            if (input.isAtField(FieldNames.mainAffixId)) {
              if (!input.trySkipNullValue()) {
                mainAffixId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 114831: {
            if (input.isAtField(FieldNames.tid)) {
              if (!input.trySkipNullValue()) {
                tid = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 102865796: {
            if (input.isAtField(FieldNames.level)) {
              if (!input.trySkipNullValue()) {
                level = input.readUInt32();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -600836050:
          case 919890188: {
            if (input.isAtField(FieldNames.subAffixList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(subAffixList);
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public DisplayRelicInfo clone() {
      return new DisplayRelicInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static DisplayRelicInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new DisplayRelicInfo(), data).checkInitialized();
    }

    public static DisplayRelicInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DisplayRelicInfo(), input).checkInitialized();
    }

    public static DisplayRelicInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DisplayRelicInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating DisplayRelicInfo messages
     */
    public static MessageFactory<DisplayRelicInfo> getFactory() {
      return DisplayRelicInfoFactory.INSTANCE;
    }

    private enum DisplayRelicInfoFactory implements MessageFactory<DisplayRelicInfo> {
      INSTANCE;

      @Override
      public DisplayRelicInfo create() {
        return DisplayRelicInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName exp = FieldName.forField("exp");

      static final FieldName slot = FieldName.forField("slot");

      static final FieldName mainAffixId = FieldName.forField("mainAffixId", "main_affix_id");

      static final FieldName tid = FieldName.forField("tid");

      static final FieldName level = FieldName.forField("level");

      static final FieldName subAffixList = FieldName.forField("subAffixList", "sub_affix_list");
    }
  }
}
