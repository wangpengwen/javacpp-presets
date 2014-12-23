// Targeted by JavaCPP version 0.10

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_imgproc.*;

public class flandmark extends org.bytedeco.javacpp.presets.flandmark {
    static { Loader.load(); }

// Parsed from flandmark_detector.h

/*
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * Written (W) 2012 Michal Uricar
 * Copyright (C) 2012 Michal Uricar
 */

// #ifndef __FLANDMARK_DETECTOR_H_
// #define __FLANDMARK_DETECTOR_H_

// #include "msvc-compat.h"
// #include <cv.h>
// #include <cvaux.h>

// index row-order matrices
// #define INDEX(ROW, COL, NUM_ROWS) ((COL)*(NUM_ROWS)+(ROW))
// #define ROW(IDX, ROWS) (((IDX)-1) % (ROWS))
// #define COL(IDX, ROWS) (((IDX)-1) / (ROWS))

public static class FLANDMARK_PSIG extends Pointer {
    static { Loader.load(); }
    public FLANDMARK_PSIG() { allocate(); }
    public FLANDMARK_PSIG(int size) { allocateArray(size); }
    public FLANDMARK_PSIG(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public FLANDMARK_PSIG position(int position) {
        return (FLANDMARK_PSIG)super.position(position);
    }

    public native IntPointer disp(); public native FLANDMARK_PSIG disp(IntPointer disp);
    public native int ROWS(); public native FLANDMARK_PSIG ROWS(int ROWS);
    public native int COLS(); public native FLANDMARK_PSIG COLS(int COLS);
}

public static class FLANDMARK_Options extends Pointer {
    static { Loader.load(); }
    public FLANDMARK_Options() { allocate(); }
    public FLANDMARK_Options(int size) { allocateArray(size); }
    public FLANDMARK_Options(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public FLANDMARK_Options position(int position) {
        return (FLANDMARK_Options)super.position(position);
    }

    public native @Cast("uint8_t") byte M(); public native FLANDMARK_Options M(byte M);
    public native IntPointer S(); public native FLANDMARK_Options S(IntPointer S);
    public native int bw(int i); public native FLANDMARK_Options bw(int i, int bw);
    @MemberGetter public native IntPointer bw();
    public native int bw_margin(int i); public native FLANDMARK_Options bw_margin(int i, int bw_margin);
    @MemberGetter public native IntPointer bw_margin();
    public native FLANDMARK_PSIG PsiGS0(); public native FLANDMARK_Options PsiGS0(FLANDMARK_PSIG PsiGS0);
    public native FLANDMARK_PSIG PsiGS1(); public native FLANDMARK_Options PsiGS1(FLANDMARK_PSIG PsiGS1);
    public native FLANDMARK_PSIG PsiGS2(); public native FLANDMARK_Options PsiGS2(FLANDMARK_PSIG PsiGS2);
    public native int PSIG_ROWS(int i); public native FLANDMARK_Options PSIG_ROWS(int i, int PSIG_ROWS);
    @MemberGetter public native IntPointer PSIG_ROWS();
    public native int PSIG_COLS(int i); public native FLANDMARK_Options PSIG_COLS(int i, int PSIG_COLS);
    @MemberGetter public native IntPointer PSIG_COLS();
}

public static class FLANDMARK_LBP extends Pointer {
    static { Loader.load(); }
    public FLANDMARK_LBP() { allocate(); }
    public FLANDMARK_LBP(int size) { allocateArray(size); }
    public FLANDMARK_LBP(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public FLANDMARK_LBP position(int position) {
        return (FLANDMARK_LBP)super.position(position);
    }

    public native int winSize(int i); public native FLANDMARK_LBP winSize(int i, int winSize);
    @MemberGetter public native IntPointer winSize();
    public native @Cast("uint8_t") byte hop(); public native FLANDMARK_LBP hop(byte hop);
    public native @Cast("uint32_t*") IntPointer wins(); public native FLANDMARK_LBP wins(IntPointer wins);
    public native int WINS_ROWS(); public native FLANDMARK_LBP WINS_ROWS(int WINS_ROWS);
    public native int WINS_COLS(); public native FLANDMARK_LBP WINS_COLS(int WINS_COLS);
}

public static class FLANDMARK_Data extends Pointer {
    static { Loader.load(); }
    public FLANDMARK_Data() { allocate(); }
    public FLANDMARK_Data(int size) { allocateArray(size); }
    public FLANDMARK_Data(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public FLANDMARK_Data position(int position) {
        return (FLANDMARK_Data)super.position(position);
    }

    public native FLANDMARK_LBP lbp(); public native FLANDMARK_Data lbp(FLANDMARK_LBP lbp);
    public native int imSize(int i); public native FLANDMARK_Data imSize(int i, int imSize);
    @MemberGetter public native IntPointer imSize();
    public native IntPointer mapTable(); public native FLANDMARK_Data mapTable(IntPointer mapTable);
    public native @ByRef FLANDMARK_Options options(); public native FLANDMARK_Data options(FLANDMARK_Options options);
}

public static class FLANDMARK_Model extends Pointer {
    static { Loader.load(); }
    public FLANDMARK_Model() { allocate(); }
    public FLANDMARK_Model(int size) { allocateArray(size); }
    public FLANDMARK_Model(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public FLANDMARK_Model position(int position) {
        return (FLANDMARK_Model)super.position(position);
    }

    public native DoublePointer W(); public native FLANDMARK_Model W(DoublePointer W);
    public native int W_ROWS(); public native FLANDMARK_Model W_ROWS(int W_ROWS);
    public native int W_COLS(); public native FLANDMARK_Model W_COLS(int W_COLS);
    public native @ByRef FLANDMARK_Data data(); public native FLANDMARK_Model data(FLANDMARK_Data data);
    public native @Cast("uint8_t*") BytePointer normalizedImageFrame(); public native FLANDMARK_Model normalizedImageFrame(BytePointer normalizedImageFrame);
    public native DoublePointer bb(); public native FLANDMARK_Model bb(DoublePointer bb);
    public native FloatPointer sf(); public native FLANDMARK_Model sf(FloatPointer sf);
}

public static class FLANDMARK_PSI extends Pointer {
    static { Loader.load(); }
    public FLANDMARK_PSI() { allocate(); }
    public FLANDMARK_PSI(int size) { allocateArray(size); }
    public FLANDMARK_PSI(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public FLANDMARK_PSI position(int position) {
        return (FLANDMARK_PSI)super.position(position);
    }

    public native @Cast("char*") BytePointer data(); public native FLANDMARK_PSI data(BytePointer data);
    public native @Cast("uint32_t") int PSI_ROWS(); public native FLANDMARK_PSI PSI_ROWS(int PSI_ROWS);
    public native @Cast("uint32_t") int PSI_COLS(); public native FLANDMARK_PSI PSI_COLS(int PSI_COLS);
}

public static class FLANDMARK_PSI_SPARSE extends Pointer {
    static { Loader.load(); }
    public FLANDMARK_PSI_SPARSE() { allocate(); }
    public FLANDMARK_PSI_SPARSE(int size) { allocateArray(size); }
    public FLANDMARK_PSI_SPARSE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public FLANDMARK_PSI_SPARSE position(int position) {
        return (FLANDMARK_PSI_SPARSE)super.position(position);
    }

    public native @Cast("uint32_t*") IntPointer idxs(); public native FLANDMARK_PSI_SPARSE idxs(IntPointer idxs);
    public native @Cast("uint32_t") int PSI_ROWS(); public native FLANDMARK_PSI_SPARSE PSI_ROWS(int PSI_ROWS);
    public native @Cast("uint32_t") int PSI_COLS(); public native FLANDMARK_PSI_SPARSE PSI_COLS(int PSI_COLS);
}
// -------------------------------------------------------------------------

/** enum EError_T */
public static final int
    NO_ERR= 0,
    ERROR_M= 1,
    ERROR_BW= 2,
    ERROR_BW_MARGIN= 3,
    ERROR_W= 4,
    ERROR_DATA_IMAGES= 5,
    ERROR_DATA_MAPTABLE= 6,
    ERROR_DATA_LBP= 7,
    ERROR_DATA_OPTIONS_S= 8,
    ERROR_DATA_OPTIONS_PSIG= 9,
    UNKNOWN_ERROR= 100;

// read / write structure Model from / to file procedures

/**
 * Function flandmark_init
 *
 * Given the path to the file containing the model in binary form, this function will return a pointer to this model. It returns null pointer in the case of failure
 *
 * \param[in] filename
 * \return Pointer to the FLANDMARK_Model data structure
 */
public static native FLANDMARK_Model flandmark_init(@Cast("const char*") BytePointer filename);
public static native FLANDMARK_Model flandmark_init(String filename);

/**
 * Function flandmark_write model
 *
 * This function writes given FLANDMARK_model data structure to a file specified by its path.
 *
 * \param[in] filename
 * \param[in] model
 */
public static native void flandmark_write_model(@Cast("const char*") BytePointer filename, FLANDMARK_Model model);
public static native void flandmark_write_model(String filename, FLANDMARK_Model model);

/**
 * Function flandmark_checkModel
 *
 * This function checks if both given FLANDMARK_Model data structres are equal
 *
 * \param[in] model
 * \param[in] tst
 * \return
 */
public static native @Cast("EError_T") int flandmark_check_model(FLANDMARK_Model model, FLANDMARK_Model tst);

/**
 * Function flandmark_free
 *
 * This function dealocates the FLANDMARK_Model data structure
 *
 * \param[in] model
 */
public static native void flandmark_free(FLANDMARK_Model model);

// getPsiMat (calls LBP features computation - liblbpfeatures from LIBOCAS)
/**
 *
 * \param[out] Psi
 * \param[in] model
 * \param[in] lbpidx
 */
public static native void flandmark_get_psi_mat(FLANDMARK_PSI Psi, FLANDMARK_Model model, int lbpidx);

/**
 * Computes LBP features representing it as sparse matrix (i.e. only inices with ones are stored in connected list)
 *
 * \param[out] Psi
 * \param[in] model
 * \param[in] lbpidx
 */
public static native void flandmark_get_psi_mat_sparse(FLANDMARK_PSI_SPARSE Psi, FLANDMARK_Model model, int lbpidx);

// dot product maximization with max-index return
/**
 * Function maximizedotprod
 *
 * \param[in]
 * \param[in]
 * \param[out]
 */
public static native void flandmark_maximize_gdotprod(DoublePointer maximum, DoublePointer idx, @Const DoublePointer first, @Const DoublePointer second, @Const IntPointer third, int cols, int tsize);
public static native void flandmark_maximize_gdotprod(DoubleBuffer maximum, DoubleBuffer idx, @Const DoubleBuffer first, @Const DoubleBuffer second, @Const IntBuffer third, int cols, int tsize);
public static native void flandmark_maximize_gdotprod(double[] maximum, double[] idx, @Const double[] first, @Const double[] second, @Const int[] third, int cols, int tsize);

/**
 * Function getNormalizedImageFrame
 *
 *
 */
public static native int flandmark_get_normalized_image_frame(IplImage input, @Const IntPointer bbox, DoublePointer bb, @Cast("uint8_t*") BytePointer face_img, FLANDMARK_Model model);
public static native int flandmark_get_normalized_image_frame(IplImage input, @Const IntBuffer bbox, DoubleBuffer bb, @Cast("uint8_t*") ByteBuffer face_img, FLANDMARK_Model model);
public static native int flandmark_get_normalized_image_frame(IplImage input, @Const int[] bbox, double[] bb, @Cast("uint8_t*") byte[] face_img, FLANDMARK_Model model);

/**
 * Function imcrop
 *
 */
public static native int flandmark_imcrop(IplImage input, IplImage output, @Const @ByVal CvRect region);

/**
 * Function argmax
 *
 */
public static native void flandmark_argmax(DoublePointer smax, FLANDMARK_Options options, @Const IntPointer mapTable, FLANDMARK_PSI_SPARSE Psi_sparse, @Cast("double**") PointerPointer q, @Cast("double**") PointerPointer g);
public static native void flandmark_argmax(DoublePointer smax, FLANDMARK_Options options, @Const IntPointer mapTable, FLANDMARK_PSI_SPARSE Psi_sparse, @ByPtrPtr DoublePointer q, @ByPtrPtr DoublePointer g);
public static native void flandmark_argmax(DoubleBuffer smax, FLANDMARK_Options options, @Const IntBuffer mapTable, FLANDMARK_PSI_SPARSE Psi_sparse, @ByPtrPtr DoubleBuffer q, @ByPtrPtr DoubleBuffer g);
public static native void flandmark_argmax(double[] smax, FLANDMARK_Options options, @Const int[] mapTable, FLANDMARK_PSI_SPARSE Psi_sparse, @ByPtrPtr double[] q, @ByPtrPtr double[] g);

/**
 * Function flandmark_detect_base
 *
 * Estimates positions of facial landmarks in the normalized image frame.
 *
 * \param[in] face_image pointer to 1D uint8 array with normalized image frame of face
 * \param[in] model Data structure holding info about model
 * \param[in, out] int array representing 2D array of size [2 x options.M] with estimated positions of landmarks
 * \return int indicator of success or fail of the detection
 */
public static native int flandmark_detect_base(@Cast("uint8_t*") BytePointer face_image, FLANDMARK_Model model, DoublePointer landmarks);
public static native int flandmark_detect_base(@Cast("uint8_t*") ByteBuffer face_image, FLANDMARK_Model model, DoubleBuffer landmarks);
public static native int flandmark_detect_base(@Cast("uint8_t*") byte[] face_image, FLANDMARK_Model model, double[] landmarks);

/**
 * Function flandmark_detect
 *
 * Estimates positions of facial landmarks given the image and the bounding box of the detected face
 *
 */
public static native int flandmark_detect(IplImage img, IntPointer bbox, FLANDMARK_Model model, DoublePointer landmarks, IntPointer bw_margin/*=0*/);
public static native int flandmark_detect(IplImage img, IntPointer bbox, FLANDMARK_Model model, DoublePointer landmarks);
public static native int flandmark_detect(IplImage img, IntBuffer bbox, FLANDMARK_Model model, DoubleBuffer landmarks, IntBuffer bw_margin/*=0*/);
public static native int flandmark_detect(IplImage img, IntBuffer bbox, FLANDMARK_Model model, DoubleBuffer landmarks);
public static native int flandmark_detect(IplImage img, int[] bbox, FLANDMARK_Model model, double[] landmarks, int[] bw_margin/*=0*/);
public static native int flandmark_detect(IplImage img, int[] bbox, FLANDMARK_Model model, double[] landmarks);

// #endif // __LIBFLD_DETECTOR_H_


// Parsed from liblbp.h

/*
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * Written (W) 2012 Vojtech Franc, Michal Uricar
 * Copyright (C) 2012 Vojtech Franc, Michal Uricar
 */

// #ifndef _liblbp_h
// #define _liblbp_h

// #include "msvc-compat.h"

// #define LIBLBP_INDEX(ROW,COL,NUM_ROWS) ((COL)*(NUM_ROWS)+(ROW))
// #define LIBLBP_MIN(A,B) ((A) > (B) ? (B) : (A))

//typedef long unsigned int t_index;

public static native void liblbp_pyr_features_sparse(@Cast("t_index*") IntPointer vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") IntPointer img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols );
public static native void liblbp_pyr_features_sparse(@Cast("t_index*") IntBuffer vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") IntBuffer img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols );
public static native void liblbp_pyr_features_sparse(@Cast("t_index*") int[] vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") int[] img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols );
public static native void liblbp_pyr_features(@Cast("char*") BytePointer vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") IntPointer img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols );
public static native void liblbp_pyr_features(@Cast("char*") ByteBuffer vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") IntBuffer img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols );
public static native void liblbp_pyr_features(@Cast("char*") byte[] vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") int[] img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols );
public static native double liblbp_pyr_dotprod(DoublePointer vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") IntPointer img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols);
public static native double liblbp_pyr_dotprod(DoubleBuffer vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") IntBuffer img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols);
public static native double liblbp_pyr_dotprod(double[] vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") int[] img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols);
public static native void liblbp_pyr_addvec(LongPointer vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") IntPointer img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols);
public static native void liblbp_pyr_addvec(LongBuffer vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") IntBuffer img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols);
public static native void liblbp_pyr_addvec(long[] vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") int[] img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols);
public static native void liblbp_pyr_subvec(LongPointer vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") IntPointer img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols);
public static native void liblbp_pyr_subvec(LongBuffer vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") IntBuffer img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols);
public static native void liblbp_pyr_subvec(long[] vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") int[] img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols);
public static native @Cast("uint32_t") int liblbp_pyr_get_dim(@Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols, @Cast("uint16_t") short nPyramids);

// #endif


}
