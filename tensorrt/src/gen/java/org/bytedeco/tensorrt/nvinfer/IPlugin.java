// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/** \class IPlugin
 * 
 *  \brief Plugin class for user-implemented layers.
 * 
 *  Plugins are a mechanism for applications to implement custom layers. Each plugin is owned by the application, and its lifetime
 *  must span any use of it by TensorRT
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IPlugin extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IPlugin(Pointer p) { super(p); }

    /**
     *  \brief Get the number of outputs from the layer.
     * 
     *  @return The number of outputs.
     * 
     *  This function is called by the implementations of INetworkDefinition and IBuilder. In particular, it is called prior to any call to initialize().
     *  */
    
    
    //!
    //!
    //!
    //!
    public native int getNbOutputs();

    /**
     *  \brief Get the dimension of an output tensor.
     * 
     *  @param index The index of the output tensor.
     *  @param inputs The input tensors.
     *  @param nbInputDims The number of input tensors.
     * 
     *  This function is called by the implementations of INetworkDefinition and IBuilder. In particular, it is called prior to any call to initialize().
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @ByVal Dims getOutputDimensions(int index, @Const Dims inputs, int nbInputDims);

    /**
     *  \brief Configure the layer.
     * 
     *  This function is called by the builder prior to initialize(). It provides an opportunity for the layer to make algorithm choices on the basis
     *  of its weights, dimensions, and maximum batch size. The type is assumed to be FP32 and format NCHW.
     * 
     *  @param inputDims The input tensor dimensions.
     *  @param nbInputs The number of inputs.
     *  @param outputDims The output tensor dimensions.
     *  @param nbOutputs The number of outputs.
     *  @param maxBatchSize The maximum batch size.
     * 
     *  The dimensions passed here do not include the outermost batch size (i.e. for 2-D image networks, they will be 3-dimensional CHW dimensions).
     * 
     *  This method is not called for PluginExt classes, configureWithFormat is called instead.
     *  */
    
    
    //!
    //!
    //!
    public native void configure(@Const Dims inputDims, int nbInputs, @Const Dims outputDims, int nbOutputs, int maxBatchSize);

    /**
     *  \brief Initialize the layer for execution. This is called when the engine is created.
     * 
     *  @return 0 for success, else non-zero (which will cause engine termination).
     *  */
    
    
    //!
    //!
    public native int initialize();

    /**
     *  \brief Release resources acquired during plugin layer initialization. This is called when the engine is destroyed.
     *  @see initialize()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native void terminate();

    /**
     *  \brief Find the workspace size required by the layer.
     * 
     *  This function is called during engine startup, after initialize(). The workspace size returned should be sufficient for any
     *  batch size up to the maximum.
     * 
     *  @return The workspace size.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("size_t") long getWorkspaceSize(int maxBatchSize);

    /**
     *  \brief Execute the layer.
     * 
     *  @param batchSize The number of inputs in the batch.
     *  @param inputs The memory for the input tensors.
     *  @param outputs The memory for the output tensors.
     *  @param workspace Workspace for execution.
     *  @param stream The stream in which to execute the kernels.
     * 
     *  @return 0 for success, else non-zero (which will cause engine termination).
     *  */
    
    
    //!
    //!
    //!
    public native int enqueue(int batchSize, @Cast("const void*const*") PointerPointer inputs, @Cast("void**") PointerPointer outputs, Pointer workspace, CUstream_st stream);
    public native int enqueue(int batchSize, @Cast("const void*const*") @ByPtrPtr Pointer inputs, @Cast("void**") @ByPtrPtr Pointer outputs, Pointer workspace, CUstream_st stream);

    /**
     *  \brief Find the size of the serialization buffer required.
     * 
     *  @return The size of the serialization buffer.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("size_t") long getSerializationSize();

    /**
     *  \brief Serialize the layer.
     * 
     *  @param buffer A pointer to a buffer of size at least that returned by getSerializationSize().
     * 
     *  @see getSerializationSize()
     *  */
    public native void serialize(Pointer buffer);
}
