// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Concrete type class for union data */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class UnionType extends NestedType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UnionType(Pointer p) { super(p); }

  @MemberGetter public static native @Cast("const arrow::Type::type") int type_id();
  public static final int type_id = type_id();

  public static native String type_name();

  public UnionType(@Const @ByRef FieldVector fields,
              @Cast("uint8_t*") @StdVector BytePointer type_codes,
              UnionMode.type mode/*=arrow::UnionMode::SPARSE*/) { super((Pointer)null); allocate(fields, type_codes, mode); }
  private native void allocate(@Const @ByRef FieldVector fields,
              @Cast("uint8_t*") @StdVector BytePointer type_codes,
              UnionMode.type mode/*=arrow::UnionMode::SPARSE*/);
  public UnionType(@Const @ByRef FieldVector fields,
              @Cast("uint8_t*") @StdVector BytePointer type_codes) { super((Pointer)null); allocate(fields, type_codes); }
  private native void allocate(@Const @ByRef FieldVector fields,
              @Cast("uint8_t*") @StdVector BytePointer type_codes);
  public UnionType(@Const @ByRef FieldVector fields,
              @Cast("uint8_t*") @StdVector ByteBuffer type_codes,
              @Cast("arrow::UnionMode::type") int mode/*=arrow::UnionMode::SPARSE*/) { super((Pointer)null); allocate(fields, type_codes, mode); }
  private native void allocate(@Const @ByRef FieldVector fields,
              @Cast("uint8_t*") @StdVector ByteBuffer type_codes,
              @Cast("arrow::UnionMode::type") int mode/*=arrow::UnionMode::SPARSE*/);
  public UnionType(@Const @ByRef FieldVector fields,
              @Cast("uint8_t*") @StdVector ByteBuffer type_codes) { super((Pointer)null); allocate(fields, type_codes); }
  private native void allocate(@Const @ByRef FieldVector fields,
              @Cast("uint8_t*") @StdVector ByteBuffer type_codes);
  public UnionType(@Const @ByRef FieldVector fields,
              @Cast("uint8_t*") @StdVector byte[] type_codes,
              UnionMode.type mode/*=arrow::UnionMode::SPARSE*/) { super((Pointer)null); allocate(fields, type_codes, mode); }
  private native void allocate(@Const @ByRef FieldVector fields,
              @Cast("uint8_t*") @StdVector byte[] type_codes,
              UnionMode.type mode/*=arrow::UnionMode::SPARSE*/);
  public UnionType(@Const @ByRef FieldVector fields,
              @Cast("uint8_t*") @StdVector byte[] type_codes) { super((Pointer)null); allocate(fields, type_codes); }
  private native void allocate(@Const @ByRef FieldVector fields,
              @Cast("uint8_t*") @StdVector byte[] type_codes);
  public UnionType(@Const @ByRef FieldVector fields,
              @Cast("uint8_t*") @StdVector BytePointer type_codes,
              @Cast("arrow::UnionMode::type") int mode/*=arrow::UnionMode::SPARSE*/) { super((Pointer)null); allocate(fields, type_codes, mode); }
  private native void allocate(@Const @ByRef FieldVector fields,
              @Cast("uint8_t*") @StdVector BytePointer type_codes,
              @Cast("arrow::UnionMode::type") int mode/*=arrow::UnionMode::SPARSE*/);
  public UnionType(@Const @ByRef FieldVector fields,
              @Cast("uint8_t*") @StdVector ByteBuffer type_codes,
              UnionMode.type mode/*=arrow::UnionMode::SPARSE*/) { super((Pointer)null); allocate(fields, type_codes, mode); }
  private native void allocate(@Const @ByRef FieldVector fields,
              @Cast("uint8_t*") @StdVector ByteBuffer type_codes,
              UnionMode.type mode/*=arrow::UnionMode::SPARSE*/);
  public UnionType(@Const @ByRef FieldVector fields,
              @Cast("uint8_t*") @StdVector byte[] type_codes,
              @Cast("arrow::UnionMode::type") int mode/*=arrow::UnionMode::SPARSE*/) { super((Pointer)null); allocate(fields, type_codes, mode); }
  private native void allocate(@Const @ByRef FieldVector fields,
              @Cast("uint8_t*") @StdVector byte[] type_codes,
              @Cast("arrow::UnionMode::type") int mode/*=arrow::UnionMode::SPARSE*/);

  public native @ByVal DataTypeLayout layout();

  public native @StdString String ToString();
  public native @StdString String name();

  public native @Cast("uint8_t*") @StdVector BytePointer type_codes();

  public native @Cast("uint8_t") byte max_type_code();

  public native UnionMode.type mode();
}
