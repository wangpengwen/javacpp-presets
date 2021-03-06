// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief The combination of a field name and data type, with optional metadata
 * 
 *  Fields are used to describe the individual constituents of a
 *  nested DataType or a Schema.
 * 
 *  A field's metadata is represented by a KeyValueMetadata instance,
 *  which holds arbitrary key-value pairs. */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class Field extends Fingerprintable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Field(Pointer p) { super(p); }

  public Field(@StdString String name, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type,
          @Cast("bool") boolean nullable/*=true*/,
          @Const @Cast("const arrow::KeyValueMetadata*") @SharedPtr @ByRef(nullValue = "std::shared_ptr<const arrow::KeyValueMetadata>(nullptr)") KeyValueMetadata metadata) { super((Pointer)null); allocate(name, type, nullable, metadata); }
  private native void allocate(@StdString String name, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type,
          @Cast("bool") boolean nullable/*=true*/,
          @Const @Cast("const arrow::KeyValueMetadata*") @SharedPtr @ByRef(nullValue = "std::shared_ptr<const arrow::KeyValueMetadata>(nullptr)") KeyValueMetadata metadata);
  public Field(@StdString String name, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(name, type); }
  private native void allocate(@StdString String name, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);
  public Field(@StdString BytePointer name, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type,
          @Cast("bool") boolean nullable/*=true*/,
          @Const @Cast("const arrow::KeyValueMetadata*") @SharedPtr @ByRef(nullValue = "std::shared_ptr<const arrow::KeyValueMetadata>(nullptr)") KeyValueMetadata metadata) { super((Pointer)null); allocate(name, type, nullable, metadata); }
  private native void allocate(@StdString BytePointer name, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type,
          @Cast("bool") boolean nullable/*=true*/,
          @Const @Cast("const arrow::KeyValueMetadata*") @SharedPtr @ByRef(nullValue = "std::shared_ptr<const arrow::KeyValueMetadata>(nullptr)") KeyValueMetadata metadata);
  public Field(@StdString BytePointer name, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(name, type); }
  private native void allocate(@StdString BytePointer name, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);

  /** \brief Return the field's attached metadata */
  public native @Cast("const arrow::KeyValueMetadata*") @SharedPtr @ByVal KeyValueMetadata metadata();

  /** \brief Return whether the field has non-empty metadata */
  public native @Cast("bool") boolean HasMetadata();

  /** \brief Return a copy of this field with the given metadata attached to it */
  public native @SharedPtr @ByVal Field WithMetadata(
        @Const @Cast("const arrow::KeyValueMetadata*") @SharedPtr @ByRef KeyValueMetadata metadata);

  public native @Deprecated @SharedPtr @ByVal Field AddMetadata(
        @Const @Cast("const arrow::KeyValueMetadata*") @SharedPtr @ByRef KeyValueMetadata metadata);

  /** \brief Return a copy of this field without any metadata attached to it */
  public native @SharedPtr @ByVal Field RemoveMetadata();

  /** \brief Return a copy of this field with the replaced type. */
  public native @SharedPtr @ByVal Field WithType(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);

  /** \brief Return a copy of this field with the replaced name. */
  public native @SharedPtr @ByVal Field WithName(@StdString String name);
  public native @SharedPtr @ByVal Field WithName(@StdString BytePointer name);

  public native @ByVal FieldVector Flatten();

  public native @Cast("bool") boolean Equals(@Const @ByRef Field other, @Cast("bool") boolean check_metadata/*=true*/);
  public native @Cast("bool") boolean Equals(@Const @ByRef Field other);

  /** \brief Return a string representation ot the field */
  public native @StdString String ToString();

  /** \brief Return the field name */
  public native @StdString String name();
  /** \brief Return the field data type */
  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type();
  /** \brief Return whether the field is nullable */
  public native @Cast("bool") boolean nullable();

  public native @SharedPtr @ByVal Field Copy();
}
