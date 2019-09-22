// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class IScaleLayer
 * 
 *  \brief A Scale layer in a network definition.
 * 
 *  This layer applies a per-element computation to its input:
 * 
 *  \p output = (\p input* \p scale + \p shift)^ \p power
 * 
 *  The coefficients can be applied on a per-tensor, per-channel, or per-element basis.
 * 
 *  \note If the number of weights is 0, then a default value is used for shift, power, and scale.
 *        The default shift is 0, the default power is 1, and the default scale is 1.
 * 
 *  The output size is the same as the input size.
 * 
 *  \note The input tensor for this layer is required to have a minimum of 3 dimensions.
 * 
 *  @see ScaleMode
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IScaleLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IScaleLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the scale mode.
     * 
     *  @see getMode()
     *  */
    
    
    //!
    //!
    //!
    public native void setMode(ScaleMode mode);
    public native void setMode(@Cast("nvinfer1::ScaleMode") int mode);

    /**
     *  \brief Set the scale mode.
     * 
     *  @see setMode()
     *  */
    
    
    //!
    //!
    //!
    public native ScaleMode getMode();

    /**
     *  \brief Set the shift value.
     * 
     *  @see getShift()
     *  */
    
    
    //!
    //!
    //!
    public native void setShift(@ByVal Weights shift);

    /**
     *  \brief Get the shift value.
     * 
     *  @see setShift()
     *  */
    
    
    //!
    //!
    //!
    public native @ByVal Weights getShift();

    /**
     *  \brief Set the scale value.
     * 
     *  @see getScale()
     *  */
    
    
    //!
    //!
    //!
    public native void setScale(@ByVal Weights scale);

    /**
     *  \brief Get the scale value.
     * 
     *  @see setScale()
     *  */
    
    
    //!
    //!
    //!
    public native @ByVal Weights getScale();

    /**
     *  \brief Set the power value.
     * 
     *  @see getPower()
     *  */
    
    
    //!
    //!
    //!
    public native void setPower(@ByVal Weights power);

    /**
     *  \brief Get the power value.
     * 
     *  @see setPower()
     *  */
    public native @ByVal Weights getPower();
    /**
     *  \brief Get the channel axis.
     * 
     *  @return channelAxis parameter passed to addScaleNd()
     * 
     *  The value is the index of the channel axis in the input tensor's dimensions. All dimensions
     *  after the channel axis are assumed to be spatial dimensions, and the only spatial dimensions
     *  in the tensor. The number of spatial dimensions is thus getDimensions().nbDims - channelAxis - 1.
     *  Supported numbers of spatial dimensions are 2 and 3 for 2d and 3d scale layers respectively.
     * 
     *  @see addScaleNd()
     *  */
    public native int getChannelAxis();
}
