/*
 * Generated file
 * DO NOT EDIT
 * 
 * See libraries/tools/idl2k for details
 */

package org.khronos.webgl

import org.w3c.dom.*
import org.w3c.dom.css.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

public external interface WebGLContextAttributes {
    var alpha: Boolean? /* true */
        get() = noImpl
        set(value) = noImpl
    var depth: Boolean? /* true */
        get() = noImpl
        set(value) = noImpl
    var stencil: Boolean? /* false */
        get() = noImpl
        set(value) = noImpl
    var antialias: Boolean? /* true */
        get() = noImpl
        set(value) = noImpl
    var premultipliedAlpha: Boolean? /* true */
        get() = noImpl
        set(value) = noImpl
    var preserveDrawingBuffer: Boolean? /* false */
        get() = noImpl
        set(value) = noImpl
    var preferLowPowerToHighPerformance: Boolean? /* false */
        get() = noImpl
        set(value) = noImpl
    var failIfMajorPerformanceCaveat: Boolean? /* false */
        get() = noImpl
        set(value) = noImpl
}

@Suppress("NOTHING_TO_INLINE")
public inline fun WebGLContextAttributes(alpha: Boolean? = noImpl /* true */, depth: Boolean? = noImpl /* true */, stencil: Boolean? = noImpl /* false */, antialias: Boolean? = noImpl /* true */, premultipliedAlpha: Boolean? = noImpl /* true */, preserveDrawingBuffer: Boolean? = noImpl /* false */, preferLowPowerToHighPerformance: Boolean? = noImpl /* false */, failIfMajorPerformanceCaveat: Boolean? = noImpl /* false */): WebGLContextAttributes {
    val o = js("({})")

    o["alpha"] = alpha
    o["depth"] = depth
    o["stencil"] = stencil
    o["antialias"] = antialias
    o["premultipliedAlpha"] = premultipliedAlpha
    o["preserveDrawingBuffer"] = preserveDrawingBuffer
    o["preferLowPowerToHighPerformance"] = preferLowPowerToHighPerformance
    o["failIfMajorPerformanceCaveat"] = failIfMajorPerformanceCaveat

    return o
}

public external abstract class WebGLObject {
}

public external abstract class WebGLBuffer : WebGLObject() {
}

public external abstract class WebGLFramebuffer : WebGLObject() {
}

public external abstract class WebGLProgram : WebGLObject() {
}

public external abstract class WebGLRenderbuffer : WebGLObject() {
}

public external abstract class WebGLShader : WebGLObject() {
}

public external abstract class WebGLTexture : WebGLObject() {
}

public external abstract class WebGLUniformLocation {
}

public external abstract class WebGLActiveInfo {
    open val size: Int
    open val type: Int
    open val name: String
}

public external abstract class WebGLShaderPrecisionFormat {
    open val rangeMin: Int
    open val rangeMax: Int
    open val precision: Int
}

public external interface WebGLRenderingContextBase {
    val canvas: HTMLCanvasElement
    val drawingBufferWidth: Int
    val drawingBufferHeight: Int
    fun getContextAttributes(): WebGLContextAttributes?
    fun isContextLost(): Boolean
    fun getSupportedExtensions(): Array<String>?
    fun getExtension(name: String): dynamic
    fun activeTexture(texture: Int): Unit
    fun attachShader(program: WebGLProgram?, shader: WebGLShader?): Unit
    fun bindAttribLocation(program: WebGLProgram?, index: Int, name: String): Unit
    fun bindBuffer(target: Int, buffer: WebGLBuffer?): Unit
    fun bindFramebuffer(target: Int, framebuffer: WebGLFramebuffer?): Unit
    fun bindRenderbuffer(target: Int, renderbuffer: WebGLRenderbuffer?): Unit
    fun bindTexture(target: Int, texture: WebGLTexture?): Unit
    fun blendColor(red: Float, green: Float, blue: Float, alpha: Float): Unit
    fun blendEquation(mode: Int): Unit
    fun blendEquationSeparate(modeRGB: Int, modeAlpha: Int): Unit
    fun blendFunc(sfactor: Int, dfactor: Int): Unit
    fun blendFuncSeparate(srcRGB: Int, dstRGB: Int, srcAlpha: Int, dstAlpha: Int): Unit
    fun bufferData(target: Int, size: Int, usage: Int): Unit
    fun bufferData(target: Int, data: BufferDataSource?, usage: Int): Unit
    fun bufferSubData(target: Int, offset: Int, data: BufferDataSource?): Unit
    fun checkFramebufferStatus(target: Int): Int
    fun clear(mask: Int): Unit
    fun clearColor(red: Float, green: Float, blue: Float, alpha: Float): Unit
    fun clearDepth(depth: Float): Unit
    fun clearStencil(s: Int): Unit
    fun colorMask(red: Boolean, green: Boolean, blue: Boolean, alpha: Boolean): Unit
    fun compileShader(shader: WebGLShader?): Unit
    fun compressedTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, data: ArrayBufferView): Unit
    fun compressedTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, data: ArrayBufferView): Unit
    fun copyTexImage2D(target: Int, level: Int, internalformat: Int, x: Int, y: Int, width: Int, height: Int, border: Int): Unit
    fun copyTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, x: Int, y: Int, width: Int, height: Int): Unit
    fun createBuffer(): WebGLBuffer?
    fun createFramebuffer(): WebGLFramebuffer?
    fun createProgram(): WebGLProgram?
    fun createRenderbuffer(): WebGLRenderbuffer?
    fun createShader(type: Int): WebGLShader?
    fun createTexture(): WebGLTexture?
    fun cullFace(mode: Int): Unit
    fun deleteBuffer(buffer: WebGLBuffer?): Unit
    fun deleteFramebuffer(framebuffer: WebGLFramebuffer?): Unit
    fun deleteProgram(program: WebGLProgram?): Unit
    fun deleteRenderbuffer(renderbuffer: WebGLRenderbuffer?): Unit
    fun deleteShader(shader: WebGLShader?): Unit
    fun deleteTexture(texture: WebGLTexture?): Unit
    fun depthFunc(func: Int): Unit
    fun depthMask(flag: Boolean): Unit
    fun depthRange(zNear: Float, zFar: Float): Unit
    fun detachShader(program: WebGLProgram?, shader: WebGLShader?): Unit
    fun disable(cap: Int): Unit
    fun disableVertexAttribArray(index: Int): Unit
    fun drawArrays(mode: Int, first: Int, count: Int): Unit
    fun drawElements(mode: Int, count: Int, type: Int, offset: Int): Unit
    fun enable(cap: Int): Unit
    fun enableVertexAttribArray(index: Int): Unit
    fun finish(): Unit
    fun flush(): Unit
    fun framebufferRenderbuffer(target: Int, attachment: Int, renderbuffertarget: Int, renderbuffer: WebGLRenderbuffer?): Unit
    fun framebufferTexture2D(target: Int, attachment: Int, textarget: Int, texture: WebGLTexture?, level: Int): Unit
    fun frontFace(mode: Int): Unit
    fun generateMipmap(target: Int): Unit
    fun getActiveAttrib(program: WebGLProgram?, index: Int): WebGLActiveInfo?
    fun getActiveUniform(program: WebGLProgram?, index: Int): WebGLActiveInfo?
    fun getAttachedShaders(program: WebGLProgram?): Array<WebGLShader>?
    fun getAttribLocation(program: WebGLProgram?, name: String): Int
    fun getBufferParameter(target: Int, pname: Int): Any?
    fun getParameter(pname: Int): Any?
    fun getError(): Int
    fun getFramebufferAttachmentParameter(target: Int, attachment: Int, pname: Int): Any?
    fun getProgramParameter(program: WebGLProgram?, pname: Int): Any?
    fun getProgramInfoLog(program: WebGLProgram?): String?
    fun getRenderbufferParameter(target: Int, pname: Int): Any?
    fun getShaderParameter(shader: WebGLShader?, pname: Int): Any?
    fun getShaderPrecisionFormat(shadertype: Int, precisiontype: Int): WebGLShaderPrecisionFormat?
    fun getShaderInfoLog(shader: WebGLShader?): String?
    fun getShaderSource(shader: WebGLShader?): String?
    fun getTexParameter(target: Int, pname: Int): Any?
    fun getUniform(program: WebGLProgram?, location: WebGLUniformLocation?): Any?
    fun getUniformLocation(program: WebGLProgram?, name: String): WebGLUniformLocation?
    fun getVertexAttrib(index: Int, pname: Int): Any?
    fun getVertexAttribOffset(index: Int, pname: Int): Int
    fun hint(target: Int, mode: Int): Unit
    fun isBuffer(buffer: WebGLBuffer?): Boolean
    fun isEnabled(cap: Int): Boolean
    fun isFramebuffer(framebuffer: WebGLFramebuffer?): Boolean
    fun isProgram(program: WebGLProgram?): Boolean
    fun isRenderbuffer(renderbuffer: WebGLRenderbuffer?): Boolean
    fun isShader(shader: WebGLShader?): Boolean
    fun isTexture(texture: WebGLTexture?): Boolean
    fun lineWidth(width: Float): Unit
    fun linkProgram(program: WebGLProgram?): Unit
    fun pixelStorei(pname: Int, param: Int): Unit
    fun polygonOffset(factor: Float, units: Float): Unit
    fun readPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, pixels: ArrayBufferView?): Unit
    fun renderbufferStorage(target: Int, internalformat: Int, width: Int, height: Int): Unit
    fun sampleCoverage(value: Float, invert: Boolean): Unit
    fun scissor(x: Int, y: Int, width: Int, height: Int): Unit
    fun shaderSource(shader: WebGLShader?, source: String): Unit
    fun stencilFunc(func: Int, ref: Int, mask: Int): Unit
    fun stencilFuncSeparate(face: Int, func: Int, ref: Int, mask: Int): Unit
    fun stencilMask(mask: Int): Unit
    fun stencilMaskSeparate(face: Int, mask: Int): Unit
    fun stencilOp(fail: Int, zfail: Int, zpass: Int): Unit
    fun stencilOpSeparate(face: Int, fail: Int, zfail: Int, zpass: Int): Unit
    fun texImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, pixels: ArrayBufferView?): Unit
    fun texImage2D(target: Int, level: Int, internalformat: Int, format: Int, type: Int, source: TexImageSource?): Unit
    fun texParameterf(target: Int, pname: Int, param: Float): Unit
    fun texParameteri(target: Int, pname: Int, param: Int): Unit
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, pixels: ArrayBufferView?): Unit
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, format: Int, type: Int, source: TexImageSource?): Unit
    fun uniform1f(location: WebGLUniformLocation?, x: Float): Unit
    fun uniform1fv(location: WebGLUniformLocation?, v: Float32Array): Unit
    fun uniform1fv(location: WebGLUniformLocation?, v: Array<Float>): Unit
    fun uniform1i(location: WebGLUniformLocation?, x: Int): Unit
    fun uniform1iv(location: WebGLUniformLocation?, v: Int32Array): Unit
    fun uniform1iv(location: WebGLUniformLocation?, v: Array<Int>): Unit
    fun uniform2f(location: WebGLUniformLocation?, x: Float, y: Float): Unit
    fun uniform2fv(location: WebGLUniformLocation?, v: Float32Array): Unit
    fun uniform2fv(location: WebGLUniformLocation?, v: Array<Float>): Unit
    fun uniform2i(location: WebGLUniformLocation?, x: Int, y: Int): Unit
    fun uniform2iv(location: WebGLUniformLocation?, v: Int32Array): Unit
    fun uniform2iv(location: WebGLUniformLocation?, v: Array<Int>): Unit
    fun uniform3f(location: WebGLUniformLocation?, x: Float, y: Float, z: Float): Unit
    fun uniform3fv(location: WebGLUniformLocation?, v: Float32Array): Unit
    fun uniform3fv(location: WebGLUniformLocation?, v: Array<Float>): Unit
    fun uniform3i(location: WebGLUniformLocation?, x: Int, y: Int, z: Int): Unit
    fun uniform3iv(location: WebGLUniformLocation?, v: Int32Array): Unit
    fun uniform3iv(location: WebGLUniformLocation?, v: Array<Int>): Unit
    fun uniform4f(location: WebGLUniformLocation?, x: Float, y: Float, z: Float, w: Float): Unit
    fun uniform4fv(location: WebGLUniformLocation?, v: Float32Array): Unit
    fun uniform4fv(location: WebGLUniformLocation?, v: Array<Float>): Unit
    fun uniform4i(location: WebGLUniformLocation?, x: Int, y: Int, z: Int, w: Int): Unit
    fun uniform4iv(location: WebGLUniformLocation?, v: Int32Array): Unit
    fun uniform4iv(location: WebGLUniformLocation?, v: Array<Int>): Unit
    fun uniformMatrix2fv(location: WebGLUniformLocation?, transpose: Boolean, value: Float32Array): Unit
    fun uniformMatrix2fv(location: WebGLUniformLocation?, transpose: Boolean, value: Array<Float>): Unit
    fun uniformMatrix3fv(location: WebGLUniformLocation?, transpose: Boolean, value: Float32Array): Unit
    fun uniformMatrix3fv(location: WebGLUniformLocation?, transpose: Boolean, value: Array<Float>): Unit
    fun uniformMatrix4fv(location: WebGLUniformLocation?, transpose: Boolean, value: Float32Array): Unit
    fun uniformMatrix4fv(location: WebGLUniformLocation?, transpose: Boolean, value: Array<Float>): Unit
    fun useProgram(program: WebGLProgram?): Unit
    fun validateProgram(program: WebGLProgram?): Unit
    fun vertexAttrib1f(index: Int, x: Float): Unit
    fun vertexAttrib1fv(index: Int, values: dynamic): Unit
    fun vertexAttrib2f(index: Int, x: Float, y: Float): Unit
    fun vertexAttrib2fv(index: Int, values: dynamic): Unit
    fun vertexAttrib3f(index: Int, x: Float, y: Float, z: Float): Unit
    fun vertexAttrib3fv(index: Int, values: dynamic): Unit
    fun vertexAttrib4f(index: Int, x: Float, y: Float, z: Float, w: Float): Unit
    fun vertexAttrib4fv(index: Int, values: dynamic): Unit
    fun vertexAttribPointer(index: Int, size: Int, type: Int, normalized: Boolean, stride: Int, offset: Int): Unit
    fun viewport(x: Int, y: Int, width: Int, height: Int): Unit

    companion object {
        val DEPTH_BUFFER_BIT: Int = noImpl /* 0x00000100 */
        val STENCIL_BUFFER_BIT: Int = noImpl /* 0x00000400 */
        val COLOR_BUFFER_BIT: Int = noImpl /* 0x00004000 */
        val POINTS: Int = noImpl /* 0x0000 */
        val LINES: Int = noImpl /* 0x0001 */
        val LINE_LOOP: Int = noImpl /* 0x0002 */
        val LINE_STRIP: Int = noImpl /* 0x0003 */
        val TRIANGLES: Int = noImpl /* 0x0004 */
        val TRIANGLE_STRIP: Int = noImpl /* 0x0005 */
        val TRIANGLE_FAN: Int = noImpl /* 0x0006 */
        val ZERO: Int = noImpl /* 0 */
        val ONE: Int = noImpl /* 1 */
        val SRC_COLOR: Int = noImpl /* 0x0300 */
        val ONE_MINUS_SRC_COLOR: Int = noImpl /* 0x0301 */
        val SRC_ALPHA: Int = noImpl /* 0x0302 */
        val ONE_MINUS_SRC_ALPHA: Int = noImpl /* 0x0303 */
        val DST_ALPHA: Int = noImpl /* 0x0304 */
        val ONE_MINUS_DST_ALPHA: Int = noImpl /* 0x0305 */
        val DST_COLOR: Int = noImpl /* 0x0306 */
        val ONE_MINUS_DST_COLOR: Int = noImpl /* 0x0307 */
        val SRC_ALPHA_SATURATE: Int = noImpl /* 0x0308 */
        val FUNC_ADD: Int = noImpl /* 0x8006 */
        val BLEND_EQUATION: Int = noImpl /* 0x8009 */
        val BLEND_EQUATION_RGB: Int = noImpl /* 0x8009 */
        val BLEND_EQUATION_ALPHA: Int = noImpl /* 0x883D */
        val FUNC_SUBTRACT: Int = noImpl /* 0x800A */
        val FUNC_REVERSE_SUBTRACT: Int = noImpl /* 0x800B */
        val BLEND_DST_RGB: Int = noImpl /* 0x80C8 */
        val BLEND_SRC_RGB: Int = noImpl /* 0x80C9 */
        val BLEND_DST_ALPHA: Int = noImpl /* 0x80CA */
        val BLEND_SRC_ALPHA: Int = noImpl /* 0x80CB */
        val CONSTANT_COLOR: Int = noImpl /* 0x8001 */
        val ONE_MINUS_CONSTANT_COLOR: Int = noImpl /* 0x8002 */
        val CONSTANT_ALPHA: Int = noImpl /* 0x8003 */
        val ONE_MINUS_CONSTANT_ALPHA: Int = noImpl /* 0x8004 */
        val BLEND_COLOR: Int = noImpl /* 0x8005 */
        val ARRAY_BUFFER: Int = noImpl /* 0x8892 */
        val ELEMENT_ARRAY_BUFFER: Int = noImpl /* 0x8893 */
        val ARRAY_BUFFER_BINDING: Int = noImpl /* 0x8894 */
        val ELEMENT_ARRAY_BUFFER_BINDING: Int = noImpl /* 0x8895 */
        val STREAM_DRAW: Int = noImpl /* 0x88E0 */
        val STATIC_DRAW: Int = noImpl /* 0x88E4 */
        val DYNAMIC_DRAW: Int = noImpl /* 0x88E8 */
        val BUFFER_SIZE: Int = noImpl /* 0x8764 */
        val BUFFER_USAGE: Int = noImpl /* 0x8765 */
        val CURRENT_VERTEX_ATTRIB: Int = noImpl /* 0x8626 */
        val FRONT: Int = noImpl /* 0x0404 */
        val BACK: Int = noImpl /* 0x0405 */
        val FRONT_AND_BACK: Int = noImpl /* 0x0408 */
        val CULL_FACE: Int = noImpl /* 0x0B44 */
        val BLEND: Int = noImpl /* 0x0BE2 */
        val DITHER: Int = noImpl /* 0x0BD0 */
        val STENCIL_TEST: Int = noImpl /* 0x0B90 */
        val DEPTH_TEST: Int = noImpl /* 0x0B71 */
        val SCISSOR_TEST: Int = noImpl /* 0x0C11 */
        val POLYGON_OFFSET_FILL: Int = noImpl /* 0x8037 */
        val SAMPLE_ALPHA_TO_COVERAGE: Int = noImpl /* 0x809E */
        val SAMPLE_COVERAGE: Int = noImpl /* 0x80A0 */
        val NO_ERROR: Int = noImpl /* 0 */
        val INVALID_ENUM: Int = noImpl /* 0x0500 */
        val INVALID_VALUE: Int = noImpl /* 0x0501 */
        val INVALID_OPERATION: Int = noImpl /* 0x0502 */
        val OUT_OF_MEMORY: Int = noImpl /* 0x0505 */
        val CW: Int = noImpl /* 0x0900 */
        val CCW: Int = noImpl /* 0x0901 */
        val LINE_WIDTH: Int = noImpl /* 0x0B21 */
        val ALIASED_POINT_SIZE_RANGE: Int = noImpl /* 0x846D */
        val ALIASED_LINE_WIDTH_RANGE: Int = noImpl /* 0x846E */
        val CULL_FACE_MODE: Int = noImpl /* 0x0B45 */
        val FRONT_FACE: Int = noImpl /* 0x0B46 */
        val DEPTH_RANGE: Int = noImpl /* 0x0B70 */
        val DEPTH_WRITEMASK: Int = noImpl /* 0x0B72 */
        val DEPTH_CLEAR_VALUE: Int = noImpl /* 0x0B73 */
        val DEPTH_FUNC: Int = noImpl /* 0x0B74 */
        val STENCIL_CLEAR_VALUE: Int = noImpl /* 0x0B91 */
        val STENCIL_FUNC: Int = noImpl /* 0x0B92 */
        val STENCIL_FAIL: Int = noImpl /* 0x0B94 */
        val STENCIL_PASS_DEPTH_FAIL: Int = noImpl /* 0x0B95 */
        val STENCIL_PASS_DEPTH_PASS: Int = noImpl /* 0x0B96 */
        val STENCIL_REF: Int = noImpl /* 0x0B97 */
        val STENCIL_VALUE_MASK: Int = noImpl /* 0x0B93 */
        val STENCIL_WRITEMASK: Int = noImpl /* 0x0B98 */
        val STENCIL_BACK_FUNC: Int = noImpl /* 0x8800 */
        val STENCIL_BACK_FAIL: Int = noImpl /* 0x8801 */
        val STENCIL_BACK_PASS_DEPTH_FAIL: Int = noImpl /* 0x8802 */
        val STENCIL_BACK_PASS_DEPTH_PASS: Int = noImpl /* 0x8803 */
        val STENCIL_BACK_REF: Int = noImpl /* 0x8CA3 */
        val STENCIL_BACK_VALUE_MASK: Int = noImpl /* 0x8CA4 */
        val STENCIL_BACK_WRITEMASK: Int = noImpl /* 0x8CA5 */
        val VIEWPORT: Int = noImpl /* 0x0BA2 */
        val SCISSOR_BOX: Int = noImpl /* 0x0C10 */
        val COLOR_CLEAR_VALUE: Int = noImpl /* 0x0C22 */
        val COLOR_WRITEMASK: Int = noImpl /* 0x0C23 */
        val UNPACK_ALIGNMENT: Int = noImpl /* 0x0CF5 */
        val PACK_ALIGNMENT: Int = noImpl /* 0x0D05 */
        val MAX_TEXTURE_SIZE: Int = noImpl /* 0x0D33 */
        val MAX_VIEWPORT_DIMS: Int = noImpl /* 0x0D3A */
        val SUBPIXEL_BITS: Int = noImpl /* 0x0D50 */
        val RED_BITS: Int = noImpl /* 0x0D52 */
        val GREEN_BITS: Int = noImpl /* 0x0D53 */
        val BLUE_BITS: Int = noImpl /* 0x0D54 */
        val ALPHA_BITS: Int = noImpl /* 0x0D55 */
        val DEPTH_BITS: Int = noImpl /* 0x0D56 */
        val STENCIL_BITS: Int = noImpl /* 0x0D57 */
        val POLYGON_OFFSET_UNITS: Int = noImpl /* 0x2A00 */
        val POLYGON_OFFSET_FACTOR: Int = noImpl /* 0x8038 */
        val TEXTURE_BINDING_2D: Int = noImpl /* 0x8069 */
        val SAMPLE_BUFFERS: Int = noImpl /* 0x80A8 */
        val SAMPLES: Int = noImpl /* 0x80A9 */
        val SAMPLE_COVERAGE_VALUE: Int = noImpl /* 0x80AA */
        val SAMPLE_COVERAGE_INVERT: Int = noImpl /* 0x80AB */
        val COMPRESSED_TEXTURE_FORMATS: Int = noImpl /* 0x86A3 */
        val DONT_CARE: Int = noImpl /* 0x1100 */
        val FASTEST: Int = noImpl /* 0x1101 */
        val NICEST: Int = noImpl /* 0x1102 */
        val GENERATE_MIPMAP_HINT: Int = noImpl /* 0x8192 */
        val BYTE: Int = noImpl /* 0x1400 */
        val UNSIGNED_BYTE: Int = noImpl /* 0x1401 */
        val SHORT: Int = noImpl /* 0x1402 */
        val UNSIGNED_SHORT: Int = noImpl /* 0x1403 */
        val INT: Int = noImpl /* 0x1404 */
        val UNSIGNED_INT: Int = noImpl /* 0x1405 */
        val FLOAT: Int = noImpl /* 0x1406 */
        val DEPTH_COMPONENT: Int = noImpl /* 0x1902 */
        val ALPHA: Int = noImpl /* 0x1906 */
        val RGB: Int = noImpl /* 0x1907 */
        val RGBA: Int = noImpl /* 0x1908 */
        val LUMINANCE: Int = noImpl /* 0x1909 */
        val LUMINANCE_ALPHA: Int = noImpl /* 0x190A */
        val UNSIGNED_SHORT_4_4_4_4: Int = noImpl /* 0x8033 */
        val UNSIGNED_SHORT_5_5_5_1: Int = noImpl /* 0x8034 */
        val UNSIGNED_SHORT_5_6_5: Int = noImpl /* 0x8363 */
        val FRAGMENT_SHADER: Int = noImpl /* 0x8B30 */
        val VERTEX_SHADER: Int = noImpl /* 0x8B31 */
        val MAX_VERTEX_ATTRIBS: Int = noImpl /* 0x8869 */
        val MAX_VERTEX_UNIFORM_VECTORS: Int = noImpl /* 0x8DFB */
        val MAX_VARYING_VECTORS: Int = noImpl /* 0x8DFC */
        val MAX_COMBINED_TEXTURE_IMAGE_UNITS: Int = noImpl /* 0x8B4D */
        val MAX_VERTEX_TEXTURE_IMAGE_UNITS: Int = noImpl /* 0x8B4C */
        val MAX_TEXTURE_IMAGE_UNITS: Int = noImpl /* 0x8872 */
        val MAX_FRAGMENT_UNIFORM_VECTORS: Int = noImpl /* 0x8DFD */
        val SHADER_TYPE: Int = noImpl /* 0x8B4F */
        val DELETE_STATUS: Int = noImpl /* 0x8B80 */
        val LINK_STATUS: Int = noImpl /* 0x8B82 */
        val VALIDATE_STATUS: Int = noImpl /* 0x8B83 */
        val ATTACHED_SHADERS: Int = noImpl /* 0x8B85 */
        val ACTIVE_UNIFORMS: Int = noImpl /* 0x8B86 */
        val ACTIVE_ATTRIBUTES: Int = noImpl /* 0x8B89 */
        val SHADING_LANGUAGE_VERSION: Int = noImpl /* 0x8B8C */
        val CURRENT_PROGRAM: Int = noImpl /* 0x8B8D */
        val NEVER: Int = noImpl /* 0x0200 */
        val LESS: Int = noImpl /* 0x0201 */
        val EQUAL: Int = noImpl /* 0x0202 */
        val LEQUAL: Int = noImpl /* 0x0203 */
        val GREATER: Int = noImpl /* 0x0204 */
        val NOTEQUAL: Int = noImpl /* 0x0205 */
        val GEQUAL: Int = noImpl /* 0x0206 */
        val ALWAYS: Int = noImpl /* 0x0207 */
        val KEEP: Int = noImpl /* 0x1E00 */
        val REPLACE: Int = noImpl /* 0x1E01 */
        val INCR: Int = noImpl /* 0x1E02 */
        val DECR: Int = noImpl /* 0x1E03 */
        val INVERT: Int = noImpl /* 0x150A */
        val INCR_WRAP: Int = noImpl /* 0x8507 */
        val DECR_WRAP: Int = noImpl /* 0x8508 */
        val VENDOR: Int = noImpl /* 0x1F00 */
        val RENDERER: Int = noImpl /* 0x1F01 */
        val VERSION: Int = noImpl /* 0x1F02 */
        val NEAREST: Int = noImpl /* 0x2600 */
        val LINEAR: Int = noImpl /* 0x2601 */
        val NEAREST_MIPMAP_NEAREST: Int = noImpl /* 0x2700 */
        val LINEAR_MIPMAP_NEAREST: Int = noImpl /* 0x2701 */
        val NEAREST_MIPMAP_LINEAR: Int = noImpl /* 0x2702 */
        val LINEAR_MIPMAP_LINEAR: Int = noImpl /* 0x2703 */
        val TEXTURE_MAG_FILTER: Int = noImpl /* 0x2800 */
        val TEXTURE_MIN_FILTER: Int = noImpl /* 0x2801 */
        val TEXTURE_WRAP_S: Int = noImpl /* 0x2802 */
        val TEXTURE_WRAP_T: Int = noImpl /* 0x2803 */
        val TEXTURE_2D: Int = noImpl /* 0x0DE1 */
        val TEXTURE: Int = noImpl /* 0x1702 */
        val TEXTURE_CUBE_MAP: Int = noImpl /* 0x8513 */
        val TEXTURE_BINDING_CUBE_MAP: Int = noImpl /* 0x8514 */
        val TEXTURE_CUBE_MAP_POSITIVE_X: Int = noImpl /* 0x8515 */
        val TEXTURE_CUBE_MAP_NEGATIVE_X: Int = noImpl /* 0x8516 */
        val TEXTURE_CUBE_MAP_POSITIVE_Y: Int = noImpl /* 0x8517 */
        val TEXTURE_CUBE_MAP_NEGATIVE_Y: Int = noImpl /* 0x8518 */
        val TEXTURE_CUBE_MAP_POSITIVE_Z: Int = noImpl /* 0x8519 */
        val TEXTURE_CUBE_MAP_NEGATIVE_Z: Int = noImpl /* 0x851A */
        val MAX_CUBE_MAP_TEXTURE_SIZE: Int = noImpl /* 0x851C */
        val TEXTURE0: Int = noImpl /* 0x84C0 */
        val TEXTURE1: Int = noImpl /* 0x84C1 */
        val TEXTURE2: Int = noImpl /* 0x84C2 */
        val TEXTURE3: Int = noImpl /* 0x84C3 */
        val TEXTURE4: Int = noImpl /* 0x84C4 */
        val TEXTURE5: Int = noImpl /* 0x84C5 */
        val TEXTURE6: Int = noImpl /* 0x84C6 */
        val TEXTURE7: Int = noImpl /* 0x84C7 */
        val TEXTURE8: Int = noImpl /* 0x84C8 */
        val TEXTURE9: Int = noImpl /* 0x84C9 */
        val TEXTURE10: Int = noImpl /* 0x84CA */
        val TEXTURE11: Int = noImpl /* 0x84CB */
        val TEXTURE12: Int = noImpl /* 0x84CC */
        val TEXTURE13: Int = noImpl /* 0x84CD */
        val TEXTURE14: Int = noImpl /* 0x84CE */
        val TEXTURE15: Int = noImpl /* 0x84CF */
        val TEXTURE16: Int = noImpl /* 0x84D0 */
        val TEXTURE17: Int = noImpl /* 0x84D1 */
        val TEXTURE18: Int = noImpl /* 0x84D2 */
        val TEXTURE19: Int = noImpl /* 0x84D3 */
        val TEXTURE20: Int = noImpl /* 0x84D4 */
        val TEXTURE21: Int = noImpl /* 0x84D5 */
        val TEXTURE22: Int = noImpl /* 0x84D6 */
        val TEXTURE23: Int = noImpl /* 0x84D7 */
        val TEXTURE24: Int = noImpl /* 0x84D8 */
        val TEXTURE25: Int = noImpl /* 0x84D9 */
        val TEXTURE26: Int = noImpl /* 0x84DA */
        val TEXTURE27: Int = noImpl /* 0x84DB */
        val TEXTURE28: Int = noImpl /* 0x84DC */
        val TEXTURE29: Int = noImpl /* 0x84DD */
        val TEXTURE30: Int = noImpl /* 0x84DE */
        val TEXTURE31: Int = noImpl /* 0x84DF */
        val ACTIVE_TEXTURE: Int = noImpl /* 0x84E0 */
        val REPEAT: Int = noImpl /* 0x2901 */
        val CLAMP_TO_EDGE: Int = noImpl /* 0x812F */
        val MIRRORED_REPEAT: Int = noImpl /* 0x8370 */
        val FLOAT_VEC2: Int = noImpl /* 0x8B50 */
        val FLOAT_VEC3: Int = noImpl /* 0x8B51 */
        val FLOAT_VEC4: Int = noImpl /* 0x8B52 */
        val INT_VEC2: Int = noImpl /* 0x8B53 */
        val INT_VEC3: Int = noImpl /* 0x8B54 */
        val INT_VEC4: Int = noImpl /* 0x8B55 */
        val BOOL: Int = noImpl /* 0x8B56 */
        val BOOL_VEC2: Int = noImpl /* 0x8B57 */
        val BOOL_VEC3: Int = noImpl /* 0x8B58 */
        val BOOL_VEC4: Int = noImpl /* 0x8B59 */
        val FLOAT_MAT2: Int = noImpl /* 0x8B5A */
        val FLOAT_MAT3: Int = noImpl /* 0x8B5B */
        val FLOAT_MAT4: Int = noImpl /* 0x8B5C */
        val SAMPLER_2D: Int = noImpl /* 0x8B5E */
        val SAMPLER_CUBE: Int = noImpl /* 0x8B60 */
        val VERTEX_ATTRIB_ARRAY_ENABLED: Int = noImpl /* 0x8622 */
        val VERTEX_ATTRIB_ARRAY_SIZE: Int = noImpl /* 0x8623 */
        val VERTEX_ATTRIB_ARRAY_STRIDE: Int = noImpl /* 0x8624 */
        val VERTEX_ATTRIB_ARRAY_TYPE: Int = noImpl /* 0x8625 */
        val VERTEX_ATTRIB_ARRAY_NORMALIZED: Int = noImpl /* 0x886A */
        val VERTEX_ATTRIB_ARRAY_POINTER: Int = noImpl /* 0x8645 */
        val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: Int = noImpl /* 0x889F */
        val IMPLEMENTATION_COLOR_READ_TYPE: Int = noImpl /* 0x8B9A */
        val IMPLEMENTATION_COLOR_READ_FORMAT: Int = noImpl /* 0x8B9B */
        val COMPILE_STATUS: Int = noImpl /* 0x8B81 */
        val LOW_FLOAT: Int = noImpl /* 0x8DF0 */
        val MEDIUM_FLOAT: Int = noImpl /* 0x8DF1 */
        val HIGH_FLOAT: Int = noImpl /* 0x8DF2 */
        val LOW_INT: Int = noImpl /* 0x8DF3 */
        val MEDIUM_INT: Int = noImpl /* 0x8DF4 */
        val HIGH_INT: Int = noImpl /* 0x8DF5 */
        val FRAMEBUFFER: Int = noImpl /* 0x8D40 */
        val RENDERBUFFER: Int = noImpl /* 0x8D41 */
        val RGBA4: Int = noImpl /* 0x8056 */
        val RGB5_A1: Int = noImpl /* 0x8057 */
        val RGB565: Int = noImpl /* 0x8D62 */
        val DEPTH_COMPONENT16: Int = noImpl /* 0x81A5 */
        val STENCIL_INDEX: Int = noImpl /* 0x1901 */
        val STENCIL_INDEX8: Int = noImpl /* 0x8D48 */
        val DEPTH_STENCIL: Int = noImpl /* 0x84F9 */
        val RENDERBUFFER_WIDTH: Int = noImpl /* 0x8D42 */
        val RENDERBUFFER_HEIGHT: Int = noImpl /* 0x8D43 */
        val RENDERBUFFER_INTERNAL_FORMAT: Int = noImpl /* 0x8D44 */
        val RENDERBUFFER_RED_SIZE: Int = noImpl /* 0x8D50 */
        val RENDERBUFFER_GREEN_SIZE: Int = noImpl /* 0x8D51 */
        val RENDERBUFFER_BLUE_SIZE: Int = noImpl /* 0x8D52 */
        val RENDERBUFFER_ALPHA_SIZE: Int = noImpl /* 0x8D53 */
        val RENDERBUFFER_DEPTH_SIZE: Int = noImpl /* 0x8D54 */
        val RENDERBUFFER_STENCIL_SIZE: Int = noImpl /* 0x8D55 */
        val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: Int = noImpl /* 0x8CD0 */
        val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: Int = noImpl /* 0x8CD1 */
        val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: Int = noImpl /* 0x8CD2 */
        val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: Int = noImpl /* 0x8CD3 */
        val COLOR_ATTACHMENT0: Int = noImpl /* 0x8CE0 */
        val DEPTH_ATTACHMENT: Int = noImpl /* 0x8D00 */
        val STENCIL_ATTACHMENT: Int = noImpl /* 0x8D20 */
        val DEPTH_STENCIL_ATTACHMENT: Int = noImpl /* 0x821A */
        val NONE: Int = noImpl /* 0 */
        val FRAMEBUFFER_COMPLETE: Int = noImpl /* 0x8CD5 */
        val FRAMEBUFFER_INCOMPLETE_ATTACHMENT: Int = noImpl /* 0x8CD6 */
        val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: Int = noImpl /* 0x8CD7 */
        val FRAMEBUFFER_INCOMPLETE_DIMENSIONS: Int = noImpl /* 0x8CD9 */
        val FRAMEBUFFER_UNSUPPORTED: Int = noImpl /* 0x8CDD */
        val FRAMEBUFFER_BINDING: Int = noImpl /* 0x8CA6 */
        val RENDERBUFFER_BINDING: Int = noImpl /* 0x8CA7 */
        val MAX_RENDERBUFFER_SIZE: Int = noImpl /* 0x84E8 */
        val INVALID_FRAMEBUFFER_OPERATION: Int = noImpl /* 0x0506 */
        val UNPACK_FLIP_Y_WEBGL: Int = noImpl /* 0x9240 */
        val UNPACK_PREMULTIPLY_ALPHA_WEBGL: Int = noImpl /* 0x9241 */
        val CONTEXT_LOST_WEBGL: Int = noImpl /* 0x9242 */
        val UNPACK_COLORSPACE_CONVERSION_WEBGL: Int = noImpl /* 0x9243 */
        val BROWSER_DEFAULT_WEBGL: Int = noImpl /* 0x9244 */
    }
}

public external abstract class WebGLRenderingContext : WebGLRenderingContextBase, RenderingContext {

    companion object {
        val DEPTH_BUFFER_BIT: Int = noImpl /* 0x00000100 */
        val STENCIL_BUFFER_BIT: Int = noImpl /* 0x00000400 */
        val COLOR_BUFFER_BIT: Int = noImpl /* 0x00004000 */
        val POINTS: Int = noImpl /* 0x0000 */
        val LINES: Int = noImpl /* 0x0001 */
        val LINE_LOOP: Int = noImpl /* 0x0002 */
        val LINE_STRIP: Int = noImpl /* 0x0003 */
        val TRIANGLES: Int = noImpl /* 0x0004 */
        val TRIANGLE_STRIP: Int = noImpl /* 0x0005 */
        val TRIANGLE_FAN: Int = noImpl /* 0x0006 */
        val ZERO: Int = noImpl /* 0 */
        val ONE: Int = noImpl /* 1 */
        val SRC_COLOR: Int = noImpl /* 0x0300 */
        val ONE_MINUS_SRC_COLOR: Int = noImpl /* 0x0301 */
        val SRC_ALPHA: Int = noImpl /* 0x0302 */
        val ONE_MINUS_SRC_ALPHA: Int = noImpl /* 0x0303 */
        val DST_ALPHA: Int = noImpl /* 0x0304 */
        val ONE_MINUS_DST_ALPHA: Int = noImpl /* 0x0305 */
        val DST_COLOR: Int = noImpl /* 0x0306 */
        val ONE_MINUS_DST_COLOR: Int = noImpl /* 0x0307 */
        val SRC_ALPHA_SATURATE: Int = noImpl /* 0x0308 */
        val FUNC_ADD: Int = noImpl /* 0x8006 */
        val BLEND_EQUATION: Int = noImpl /* 0x8009 */
        val BLEND_EQUATION_RGB: Int = noImpl /* 0x8009 */
        val BLEND_EQUATION_ALPHA: Int = noImpl /* 0x883D */
        val FUNC_SUBTRACT: Int = noImpl /* 0x800A */
        val FUNC_REVERSE_SUBTRACT: Int = noImpl /* 0x800B */
        val BLEND_DST_RGB: Int = noImpl /* 0x80C8 */
        val BLEND_SRC_RGB: Int = noImpl /* 0x80C9 */
        val BLEND_DST_ALPHA: Int = noImpl /* 0x80CA */
        val BLEND_SRC_ALPHA: Int = noImpl /* 0x80CB */
        val CONSTANT_COLOR: Int = noImpl /* 0x8001 */
        val ONE_MINUS_CONSTANT_COLOR: Int = noImpl /* 0x8002 */
        val CONSTANT_ALPHA: Int = noImpl /* 0x8003 */
        val ONE_MINUS_CONSTANT_ALPHA: Int = noImpl /* 0x8004 */
        val BLEND_COLOR: Int = noImpl /* 0x8005 */
        val ARRAY_BUFFER: Int = noImpl /* 0x8892 */
        val ELEMENT_ARRAY_BUFFER: Int = noImpl /* 0x8893 */
        val ARRAY_BUFFER_BINDING: Int = noImpl /* 0x8894 */
        val ELEMENT_ARRAY_BUFFER_BINDING: Int = noImpl /* 0x8895 */
        val STREAM_DRAW: Int = noImpl /* 0x88E0 */
        val STATIC_DRAW: Int = noImpl /* 0x88E4 */
        val DYNAMIC_DRAW: Int = noImpl /* 0x88E8 */
        val BUFFER_SIZE: Int = noImpl /* 0x8764 */
        val BUFFER_USAGE: Int = noImpl /* 0x8765 */
        val CURRENT_VERTEX_ATTRIB: Int = noImpl /* 0x8626 */
        val FRONT: Int = noImpl /* 0x0404 */
        val BACK: Int = noImpl /* 0x0405 */
        val FRONT_AND_BACK: Int = noImpl /* 0x0408 */
        val CULL_FACE: Int = noImpl /* 0x0B44 */
        val BLEND: Int = noImpl /* 0x0BE2 */
        val DITHER: Int = noImpl /* 0x0BD0 */
        val STENCIL_TEST: Int = noImpl /* 0x0B90 */
        val DEPTH_TEST: Int = noImpl /* 0x0B71 */
        val SCISSOR_TEST: Int = noImpl /* 0x0C11 */
        val POLYGON_OFFSET_FILL: Int = noImpl /* 0x8037 */
        val SAMPLE_ALPHA_TO_COVERAGE: Int = noImpl /* 0x809E */
        val SAMPLE_COVERAGE: Int = noImpl /* 0x80A0 */
        val NO_ERROR: Int = noImpl /* 0 */
        val INVALID_ENUM: Int = noImpl /* 0x0500 */
        val INVALID_VALUE: Int = noImpl /* 0x0501 */
        val INVALID_OPERATION: Int = noImpl /* 0x0502 */
        val OUT_OF_MEMORY: Int = noImpl /* 0x0505 */
        val CW: Int = noImpl /* 0x0900 */
        val CCW: Int = noImpl /* 0x0901 */
        val LINE_WIDTH: Int = noImpl /* 0x0B21 */
        val ALIASED_POINT_SIZE_RANGE: Int = noImpl /* 0x846D */
        val ALIASED_LINE_WIDTH_RANGE: Int = noImpl /* 0x846E */
        val CULL_FACE_MODE: Int = noImpl /* 0x0B45 */
        val FRONT_FACE: Int = noImpl /* 0x0B46 */
        val DEPTH_RANGE: Int = noImpl /* 0x0B70 */
        val DEPTH_WRITEMASK: Int = noImpl /* 0x0B72 */
        val DEPTH_CLEAR_VALUE: Int = noImpl /* 0x0B73 */
        val DEPTH_FUNC: Int = noImpl /* 0x0B74 */
        val STENCIL_CLEAR_VALUE: Int = noImpl /* 0x0B91 */
        val STENCIL_FUNC: Int = noImpl /* 0x0B92 */
        val STENCIL_FAIL: Int = noImpl /* 0x0B94 */
        val STENCIL_PASS_DEPTH_FAIL: Int = noImpl /* 0x0B95 */
        val STENCIL_PASS_DEPTH_PASS: Int = noImpl /* 0x0B96 */
        val STENCIL_REF: Int = noImpl /* 0x0B97 */
        val STENCIL_VALUE_MASK: Int = noImpl /* 0x0B93 */
        val STENCIL_WRITEMASK: Int = noImpl /* 0x0B98 */
        val STENCIL_BACK_FUNC: Int = noImpl /* 0x8800 */
        val STENCIL_BACK_FAIL: Int = noImpl /* 0x8801 */
        val STENCIL_BACK_PASS_DEPTH_FAIL: Int = noImpl /* 0x8802 */
        val STENCIL_BACK_PASS_DEPTH_PASS: Int = noImpl /* 0x8803 */
        val STENCIL_BACK_REF: Int = noImpl /* 0x8CA3 */
        val STENCIL_BACK_VALUE_MASK: Int = noImpl /* 0x8CA4 */
        val STENCIL_BACK_WRITEMASK: Int = noImpl /* 0x8CA5 */
        val VIEWPORT: Int = noImpl /* 0x0BA2 */
        val SCISSOR_BOX: Int = noImpl /* 0x0C10 */
        val COLOR_CLEAR_VALUE: Int = noImpl /* 0x0C22 */
        val COLOR_WRITEMASK: Int = noImpl /* 0x0C23 */
        val UNPACK_ALIGNMENT: Int = noImpl /* 0x0CF5 */
        val PACK_ALIGNMENT: Int = noImpl /* 0x0D05 */
        val MAX_TEXTURE_SIZE: Int = noImpl /* 0x0D33 */
        val MAX_VIEWPORT_DIMS: Int = noImpl /* 0x0D3A */
        val SUBPIXEL_BITS: Int = noImpl /* 0x0D50 */
        val RED_BITS: Int = noImpl /* 0x0D52 */
        val GREEN_BITS: Int = noImpl /* 0x0D53 */
        val BLUE_BITS: Int = noImpl /* 0x0D54 */
        val ALPHA_BITS: Int = noImpl /* 0x0D55 */
        val DEPTH_BITS: Int = noImpl /* 0x0D56 */
        val STENCIL_BITS: Int = noImpl /* 0x0D57 */
        val POLYGON_OFFSET_UNITS: Int = noImpl /* 0x2A00 */
        val POLYGON_OFFSET_FACTOR: Int = noImpl /* 0x8038 */
        val TEXTURE_BINDING_2D: Int = noImpl /* 0x8069 */
        val SAMPLE_BUFFERS: Int = noImpl /* 0x80A8 */
        val SAMPLES: Int = noImpl /* 0x80A9 */
        val SAMPLE_COVERAGE_VALUE: Int = noImpl /* 0x80AA */
        val SAMPLE_COVERAGE_INVERT: Int = noImpl /* 0x80AB */
        val COMPRESSED_TEXTURE_FORMATS: Int = noImpl /* 0x86A3 */
        val DONT_CARE: Int = noImpl /* 0x1100 */
        val FASTEST: Int = noImpl /* 0x1101 */
        val NICEST: Int = noImpl /* 0x1102 */
        val GENERATE_MIPMAP_HINT: Int = noImpl /* 0x8192 */
        val BYTE: Int = noImpl /* 0x1400 */
        val UNSIGNED_BYTE: Int = noImpl /* 0x1401 */
        val SHORT: Int = noImpl /* 0x1402 */
        val UNSIGNED_SHORT: Int = noImpl /* 0x1403 */
        val INT: Int = noImpl /* 0x1404 */
        val UNSIGNED_INT: Int = noImpl /* 0x1405 */
        val FLOAT: Int = noImpl /* 0x1406 */
        val DEPTH_COMPONENT: Int = noImpl /* 0x1902 */
        val ALPHA: Int = noImpl /* 0x1906 */
        val RGB: Int = noImpl /* 0x1907 */
        val RGBA: Int = noImpl /* 0x1908 */
        val LUMINANCE: Int = noImpl /* 0x1909 */
        val LUMINANCE_ALPHA: Int = noImpl /* 0x190A */
        val UNSIGNED_SHORT_4_4_4_4: Int = noImpl /* 0x8033 */
        val UNSIGNED_SHORT_5_5_5_1: Int = noImpl /* 0x8034 */
        val UNSIGNED_SHORT_5_6_5: Int = noImpl /* 0x8363 */
        val FRAGMENT_SHADER: Int = noImpl /* 0x8B30 */
        val VERTEX_SHADER: Int = noImpl /* 0x8B31 */
        val MAX_VERTEX_ATTRIBS: Int = noImpl /* 0x8869 */
        val MAX_VERTEX_UNIFORM_VECTORS: Int = noImpl /* 0x8DFB */
        val MAX_VARYING_VECTORS: Int = noImpl /* 0x8DFC */
        val MAX_COMBINED_TEXTURE_IMAGE_UNITS: Int = noImpl /* 0x8B4D */
        val MAX_VERTEX_TEXTURE_IMAGE_UNITS: Int = noImpl /* 0x8B4C */
        val MAX_TEXTURE_IMAGE_UNITS: Int = noImpl /* 0x8872 */
        val MAX_FRAGMENT_UNIFORM_VECTORS: Int = noImpl /* 0x8DFD */
        val SHADER_TYPE: Int = noImpl /* 0x8B4F */
        val DELETE_STATUS: Int = noImpl /* 0x8B80 */
        val LINK_STATUS: Int = noImpl /* 0x8B82 */
        val VALIDATE_STATUS: Int = noImpl /* 0x8B83 */
        val ATTACHED_SHADERS: Int = noImpl /* 0x8B85 */
        val ACTIVE_UNIFORMS: Int = noImpl /* 0x8B86 */
        val ACTIVE_ATTRIBUTES: Int = noImpl /* 0x8B89 */
        val SHADING_LANGUAGE_VERSION: Int = noImpl /* 0x8B8C */
        val CURRENT_PROGRAM: Int = noImpl /* 0x8B8D */
        val NEVER: Int = noImpl /* 0x0200 */
        val LESS: Int = noImpl /* 0x0201 */
        val EQUAL: Int = noImpl /* 0x0202 */
        val LEQUAL: Int = noImpl /* 0x0203 */
        val GREATER: Int = noImpl /* 0x0204 */
        val NOTEQUAL: Int = noImpl /* 0x0205 */
        val GEQUAL: Int = noImpl /* 0x0206 */
        val ALWAYS: Int = noImpl /* 0x0207 */
        val KEEP: Int = noImpl /* 0x1E00 */
        val REPLACE: Int = noImpl /* 0x1E01 */
        val INCR: Int = noImpl /* 0x1E02 */
        val DECR: Int = noImpl /* 0x1E03 */
        val INVERT: Int = noImpl /* 0x150A */
        val INCR_WRAP: Int = noImpl /* 0x8507 */
        val DECR_WRAP: Int = noImpl /* 0x8508 */
        val VENDOR: Int = noImpl /* 0x1F00 */
        val RENDERER: Int = noImpl /* 0x1F01 */
        val VERSION: Int = noImpl /* 0x1F02 */
        val NEAREST: Int = noImpl /* 0x2600 */
        val LINEAR: Int = noImpl /* 0x2601 */
        val NEAREST_MIPMAP_NEAREST: Int = noImpl /* 0x2700 */
        val LINEAR_MIPMAP_NEAREST: Int = noImpl /* 0x2701 */
        val NEAREST_MIPMAP_LINEAR: Int = noImpl /* 0x2702 */
        val LINEAR_MIPMAP_LINEAR: Int = noImpl /* 0x2703 */
        val TEXTURE_MAG_FILTER: Int = noImpl /* 0x2800 */
        val TEXTURE_MIN_FILTER: Int = noImpl /* 0x2801 */
        val TEXTURE_WRAP_S: Int = noImpl /* 0x2802 */
        val TEXTURE_WRAP_T: Int = noImpl /* 0x2803 */
        val TEXTURE_2D: Int = noImpl /* 0x0DE1 */
        val TEXTURE: Int = noImpl /* 0x1702 */
        val TEXTURE_CUBE_MAP: Int = noImpl /* 0x8513 */
        val TEXTURE_BINDING_CUBE_MAP: Int = noImpl /* 0x8514 */
        val TEXTURE_CUBE_MAP_POSITIVE_X: Int = noImpl /* 0x8515 */
        val TEXTURE_CUBE_MAP_NEGATIVE_X: Int = noImpl /* 0x8516 */
        val TEXTURE_CUBE_MAP_POSITIVE_Y: Int = noImpl /* 0x8517 */
        val TEXTURE_CUBE_MAP_NEGATIVE_Y: Int = noImpl /* 0x8518 */
        val TEXTURE_CUBE_MAP_POSITIVE_Z: Int = noImpl /* 0x8519 */
        val TEXTURE_CUBE_MAP_NEGATIVE_Z: Int = noImpl /* 0x851A */
        val MAX_CUBE_MAP_TEXTURE_SIZE: Int = noImpl /* 0x851C */
        val TEXTURE0: Int = noImpl /* 0x84C0 */
        val TEXTURE1: Int = noImpl /* 0x84C1 */
        val TEXTURE2: Int = noImpl /* 0x84C2 */
        val TEXTURE3: Int = noImpl /* 0x84C3 */
        val TEXTURE4: Int = noImpl /* 0x84C4 */
        val TEXTURE5: Int = noImpl /* 0x84C5 */
        val TEXTURE6: Int = noImpl /* 0x84C6 */
        val TEXTURE7: Int = noImpl /* 0x84C7 */
        val TEXTURE8: Int = noImpl /* 0x84C8 */
        val TEXTURE9: Int = noImpl /* 0x84C9 */
        val TEXTURE10: Int = noImpl /* 0x84CA */
        val TEXTURE11: Int = noImpl /* 0x84CB */
        val TEXTURE12: Int = noImpl /* 0x84CC */
        val TEXTURE13: Int = noImpl /* 0x84CD */
        val TEXTURE14: Int = noImpl /* 0x84CE */
        val TEXTURE15: Int = noImpl /* 0x84CF */
        val TEXTURE16: Int = noImpl /* 0x84D0 */
        val TEXTURE17: Int = noImpl /* 0x84D1 */
        val TEXTURE18: Int = noImpl /* 0x84D2 */
        val TEXTURE19: Int = noImpl /* 0x84D3 */
        val TEXTURE20: Int = noImpl /* 0x84D4 */
        val TEXTURE21: Int = noImpl /* 0x84D5 */
        val TEXTURE22: Int = noImpl /* 0x84D6 */
        val TEXTURE23: Int = noImpl /* 0x84D7 */
        val TEXTURE24: Int = noImpl /* 0x84D8 */
        val TEXTURE25: Int = noImpl /* 0x84D9 */
        val TEXTURE26: Int = noImpl /* 0x84DA */
        val TEXTURE27: Int = noImpl /* 0x84DB */
        val TEXTURE28: Int = noImpl /* 0x84DC */
        val TEXTURE29: Int = noImpl /* 0x84DD */
        val TEXTURE30: Int = noImpl /* 0x84DE */
        val TEXTURE31: Int = noImpl /* 0x84DF */
        val ACTIVE_TEXTURE: Int = noImpl /* 0x84E0 */
        val REPEAT: Int = noImpl /* 0x2901 */
        val CLAMP_TO_EDGE: Int = noImpl /* 0x812F */
        val MIRRORED_REPEAT: Int = noImpl /* 0x8370 */
        val FLOAT_VEC2: Int = noImpl /* 0x8B50 */
        val FLOAT_VEC3: Int = noImpl /* 0x8B51 */
        val FLOAT_VEC4: Int = noImpl /* 0x8B52 */
        val INT_VEC2: Int = noImpl /* 0x8B53 */
        val INT_VEC3: Int = noImpl /* 0x8B54 */
        val INT_VEC4: Int = noImpl /* 0x8B55 */
        val BOOL: Int = noImpl /* 0x8B56 */
        val BOOL_VEC2: Int = noImpl /* 0x8B57 */
        val BOOL_VEC3: Int = noImpl /* 0x8B58 */
        val BOOL_VEC4: Int = noImpl /* 0x8B59 */
        val FLOAT_MAT2: Int = noImpl /* 0x8B5A */
        val FLOAT_MAT3: Int = noImpl /* 0x8B5B */
        val FLOAT_MAT4: Int = noImpl /* 0x8B5C */
        val SAMPLER_2D: Int = noImpl /* 0x8B5E */
        val SAMPLER_CUBE: Int = noImpl /* 0x8B60 */
        val VERTEX_ATTRIB_ARRAY_ENABLED: Int = noImpl /* 0x8622 */
        val VERTEX_ATTRIB_ARRAY_SIZE: Int = noImpl /* 0x8623 */
        val VERTEX_ATTRIB_ARRAY_STRIDE: Int = noImpl /* 0x8624 */
        val VERTEX_ATTRIB_ARRAY_TYPE: Int = noImpl /* 0x8625 */
        val VERTEX_ATTRIB_ARRAY_NORMALIZED: Int = noImpl /* 0x886A */
        val VERTEX_ATTRIB_ARRAY_POINTER: Int = noImpl /* 0x8645 */
        val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: Int = noImpl /* 0x889F */
        val IMPLEMENTATION_COLOR_READ_TYPE: Int = noImpl /* 0x8B9A */
        val IMPLEMENTATION_COLOR_READ_FORMAT: Int = noImpl /* 0x8B9B */
        val COMPILE_STATUS: Int = noImpl /* 0x8B81 */
        val LOW_FLOAT: Int = noImpl /* 0x8DF0 */
        val MEDIUM_FLOAT: Int = noImpl /* 0x8DF1 */
        val HIGH_FLOAT: Int = noImpl /* 0x8DF2 */
        val LOW_INT: Int = noImpl /* 0x8DF3 */
        val MEDIUM_INT: Int = noImpl /* 0x8DF4 */
        val HIGH_INT: Int = noImpl /* 0x8DF5 */
        val FRAMEBUFFER: Int = noImpl /* 0x8D40 */
        val RENDERBUFFER: Int = noImpl /* 0x8D41 */
        val RGBA4: Int = noImpl /* 0x8056 */
        val RGB5_A1: Int = noImpl /* 0x8057 */
        val RGB565: Int = noImpl /* 0x8D62 */
        val DEPTH_COMPONENT16: Int = noImpl /* 0x81A5 */
        val STENCIL_INDEX: Int = noImpl /* 0x1901 */
        val STENCIL_INDEX8: Int = noImpl /* 0x8D48 */
        val DEPTH_STENCIL: Int = noImpl /* 0x84F9 */
        val RENDERBUFFER_WIDTH: Int = noImpl /* 0x8D42 */
        val RENDERBUFFER_HEIGHT: Int = noImpl /* 0x8D43 */
        val RENDERBUFFER_INTERNAL_FORMAT: Int = noImpl /* 0x8D44 */
        val RENDERBUFFER_RED_SIZE: Int = noImpl /* 0x8D50 */
        val RENDERBUFFER_GREEN_SIZE: Int = noImpl /* 0x8D51 */
        val RENDERBUFFER_BLUE_SIZE: Int = noImpl /* 0x8D52 */
        val RENDERBUFFER_ALPHA_SIZE: Int = noImpl /* 0x8D53 */
        val RENDERBUFFER_DEPTH_SIZE: Int = noImpl /* 0x8D54 */
        val RENDERBUFFER_STENCIL_SIZE: Int = noImpl /* 0x8D55 */
        val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: Int = noImpl /* 0x8CD0 */
        val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: Int = noImpl /* 0x8CD1 */
        val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: Int = noImpl /* 0x8CD2 */
        val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: Int = noImpl /* 0x8CD3 */
        val COLOR_ATTACHMENT0: Int = noImpl /* 0x8CE0 */
        val DEPTH_ATTACHMENT: Int = noImpl /* 0x8D00 */
        val STENCIL_ATTACHMENT: Int = noImpl /* 0x8D20 */
        val DEPTH_STENCIL_ATTACHMENT: Int = noImpl /* 0x821A */
        val NONE: Int = noImpl /* 0 */
        val FRAMEBUFFER_COMPLETE: Int = noImpl /* 0x8CD5 */
        val FRAMEBUFFER_INCOMPLETE_ATTACHMENT: Int = noImpl /* 0x8CD6 */
        val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: Int = noImpl /* 0x8CD7 */
        val FRAMEBUFFER_INCOMPLETE_DIMENSIONS: Int = noImpl /* 0x8CD9 */
        val FRAMEBUFFER_UNSUPPORTED: Int = noImpl /* 0x8CDD */
        val FRAMEBUFFER_BINDING: Int = noImpl /* 0x8CA6 */
        val RENDERBUFFER_BINDING: Int = noImpl /* 0x8CA7 */
        val MAX_RENDERBUFFER_SIZE: Int = noImpl /* 0x84E8 */
        val INVALID_FRAMEBUFFER_OPERATION: Int = noImpl /* 0x0506 */
        val UNPACK_FLIP_Y_WEBGL: Int = noImpl /* 0x9240 */
        val UNPACK_PREMULTIPLY_ALPHA_WEBGL: Int = noImpl /* 0x9241 */
        val CONTEXT_LOST_WEBGL: Int = noImpl /* 0x9242 */
        val UNPACK_COLORSPACE_CONVERSION_WEBGL: Int = noImpl /* 0x9243 */
        val BROWSER_DEFAULT_WEBGL: Int = noImpl /* 0x9244 */
    }
}

public external open class WebGLContextEvent(type: String, eventInit: WebGLContextEventInit = noImpl /* noImpl */) : Event(type, noImpl) {
    open val statusMessage: String
}

public external interface WebGLContextEventInit : EventInit {
    var statusMessage: String? /* "" */
        get() = noImpl
        set(value) = noImpl
}

@Suppress("NOTHING_TO_INLINE")
public inline fun WebGLContextEventInit(statusMessage: String? = noImpl /* "" */, bubbles: Boolean? = noImpl /* false */, cancelable: Boolean? = noImpl /* false */, composed: Boolean? = noImpl /* false */): WebGLContextEventInit {
    val o = js("({})")

    o["statusMessage"] = statusMessage
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed

    return o
}

public external open class ArrayBuffer(length: Int) : BufferDataSource {
    open val byteLength: Int
    fun slice(begin: Int, end: Int = noImpl /* noImpl */): ArrayBuffer

    companion object {
        fun isView(value: Any?): Boolean
    }
}

public external interface ArrayBufferView : BufferDataSource {
    val buffer: ArrayBuffer
    val byteOffset: Int
    val byteLength: Int
}

public external open class Int8Array : ArrayBufferView {
    constructor(length: Int)
    constructor(array: Int8Array)
    constructor(array: Array<Byte>)
    constructor(buffer: ArrayBuffer, byteOffset: Int = noImpl /* noImpl */, length: Int = noImpl /* noImpl */)
    open val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    @Suppress("NATIVE_GETTER_RETURN_TYPE_SHOULD_BE_NULLABLE")
    @nativeGetter
    operator fun get(index: Int): Byte
    @nativeSetter
    operator fun set(index: Int, value: Byte): Unit
    fun set(array: Int8Array, offset: Int = noImpl /* noImpl */): Unit
    fun set(array: Array<Byte>, offset: Int = noImpl /* noImpl */): Unit
    fun subarray(start: Int, end: Int): Int8Array

    companion object {
        val BYTES_PER_ELEMENT: Int = noImpl /* 1 */
    }
}

public external open class Uint8Array : ArrayBufferView {
    constructor(length: Int)
    constructor(array: Uint8Array)
    constructor(array: Array<Byte>)
    constructor(buffer: ArrayBuffer, byteOffset: Int = noImpl /* noImpl */, length: Int = noImpl /* noImpl */)
    open val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    @Suppress("NATIVE_GETTER_RETURN_TYPE_SHOULD_BE_NULLABLE")
    @nativeGetter
    operator fun get(index: Int): Byte
    @nativeSetter
    operator fun set(index: Int, value: Byte): Unit
    fun set(array: Uint8Array, offset: Int = noImpl /* noImpl */): Unit
    fun set(array: Array<Byte>, offset: Int = noImpl /* noImpl */): Unit
    fun subarray(start: Int, end: Int): Uint8Array

    companion object {
        val BYTES_PER_ELEMENT: Int = noImpl /* 1 */
    }
}

public external open class Uint8ClampedArray : ArrayBufferView {
    constructor(length: Int)
    constructor(array: Uint8ClampedArray)
    constructor(array: Array<Byte>)
    constructor(buffer: ArrayBuffer, byteOffset: Int = noImpl /* noImpl */, length: Int = noImpl /* noImpl */)
    open val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    @Suppress("NATIVE_GETTER_RETURN_TYPE_SHOULD_BE_NULLABLE")
    @nativeGetter
    operator fun get(index: Int): Byte
    @nativeSetter
    operator fun set(index: Int, value: Byte): Unit
    fun set(array: Uint8ClampedArray, offset: Int = noImpl /* noImpl */): Unit
    fun set(array: Array<Byte>, offset: Int = noImpl /* noImpl */): Unit
    fun subarray(start: Int, end: Int): Uint8ClampedArray

    companion object {
        val BYTES_PER_ELEMENT: Int = noImpl /* 1 */
    }
}

public external open class Int16Array : ArrayBufferView {
    constructor(length: Int)
    constructor(array: Int16Array)
    constructor(array: Array<Short>)
    constructor(buffer: ArrayBuffer, byteOffset: Int = noImpl /* noImpl */, length: Int = noImpl /* noImpl */)
    open val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    @Suppress("NATIVE_GETTER_RETURN_TYPE_SHOULD_BE_NULLABLE")
    @nativeGetter
    operator fun get(index: Int): Short
    @nativeSetter
    operator fun set(index: Int, value: Short): Unit
    fun set(array: Int16Array, offset: Int = noImpl /* noImpl */): Unit
    fun set(array: Array<Short>, offset: Int = noImpl /* noImpl */): Unit
    fun subarray(start: Int, end: Int): Int16Array

    companion object {
        val BYTES_PER_ELEMENT: Int = noImpl /* 2 */
    }
}

public external open class Uint16Array : ArrayBufferView {
    constructor(length: Int)
    constructor(array: Uint16Array)
    constructor(array: Array<Short>)
    constructor(buffer: ArrayBuffer, byteOffset: Int = noImpl /* noImpl */, length: Int = noImpl /* noImpl */)
    open val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    @Suppress("NATIVE_GETTER_RETURN_TYPE_SHOULD_BE_NULLABLE")
    @nativeGetter
    operator fun get(index: Int): Short
    @nativeSetter
    operator fun set(index: Int, value: Short): Unit
    fun set(array: Uint16Array, offset: Int = noImpl /* noImpl */): Unit
    fun set(array: Array<Short>, offset: Int = noImpl /* noImpl */): Unit
    fun subarray(start: Int, end: Int): Uint16Array

    companion object {
        val BYTES_PER_ELEMENT: Int = noImpl /* 2 */
    }
}

public external open class Int32Array : ArrayBufferView {
    constructor(length: Int)
    constructor(array: Int32Array)
    constructor(array: Array<Int>)
    constructor(buffer: ArrayBuffer, byteOffset: Int = noImpl /* noImpl */, length: Int = noImpl /* noImpl */)
    open val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    @Suppress("NATIVE_GETTER_RETURN_TYPE_SHOULD_BE_NULLABLE")
    @nativeGetter
    operator fun get(index: Int): Int
    @nativeSetter
    operator fun set(index: Int, value: Int): Unit
    fun set(array: Int32Array, offset: Int = noImpl /* noImpl */): Unit
    fun set(array: Array<Int>, offset: Int = noImpl /* noImpl */): Unit
    fun subarray(start: Int, end: Int): Int32Array

    companion object {
        val BYTES_PER_ELEMENT: Int = noImpl /* 4 */
    }
}

public external open class Uint32Array : ArrayBufferView {
    constructor(length: Int)
    constructor(array: Uint32Array)
    constructor(array: Array<Int>)
    constructor(buffer: ArrayBuffer, byteOffset: Int = noImpl /* noImpl */, length: Int = noImpl /* noImpl */)
    open val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    @Suppress("NATIVE_GETTER_RETURN_TYPE_SHOULD_BE_NULLABLE")
    @nativeGetter
    operator fun get(index: Int): Int
    @nativeSetter
    operator fun set(index: Int, value: Int): Unit
    fun set(array: Uint32Array, offset: Int = noImpl /* noImpl */): Unit
    fun set(array: Array<Int>, offset: Int = noImpl /* noImpl */): Unit
    fun subarray(start: Int, end: Int): Uint32Array

    companion object {
        val BYTES_PER_ELEMENT: Int = noImpl /* 4 */
    }
}

public external open class Float32Array : ArrayBufferView {
    constructor(length: Int)
    constructor(array: Float32Array)
    constructor(array: Array<Float>)
    constructor(buffer: ArrayBuffer, byteOffset: Int = noImpl /* noImpl */, length: Int = noImpl /* noImpl */)
    open val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    @Suppress("NATIVE_GETTER_RETURN_TYPE_SHOULD_BE_NULLABLE")
    @nativeGetter
    operator fun get(index: Int): Float
    @nativeSetter
    operator fun set(index: Int, value: Float): Unit
    fun set(array: Float32Array, offset: Int = noImpl /* noImpl */): Unit
    fun set(array: Array<Float>, offset: Int = noImpl /* noImpl */): Unit
    fun subarray(start: Int, end: Int): Float32Array

    companion object {
        val BYTES_PER_ELEMENT: Int = noImpl /* 4 */
    }
}

public external open class Float64Array : ArrayBufferView {
    constructor(length: Int)
    constructor(array: Float64Array)
    constructor(array: Array<Double>)
    constructor(buffer: ArrayBuffer, byteOffset: Int = noImpl /* noImpl */, length: Int = noImpl /* noImpl */)
    open val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    @Suppress("NATIVE_GETTER_RETURN_TYPE_SHOULD_BE_NULLABLE")
    @nativeGetter
    operator fun get(index: Int): Double
    @nativeSetter
    operator fun set(index: Int, value: Double): Unit
    fun set(array: Float64Array, offset: Int = noImpl /* noImpl */): Unit
    fun set(array: Array<Double>, offset: Int = noImpl /* noImpl */): Unit
    fun subarray(start: Int, end: Int): Float64Array

    companion object {
        val BYTES_PER_ELEMENT: Int = noImpl /* 8 */
    }
}

public external open class DataView(buffer: ArrayBuffer, byteOffset: Int = noImpl /* noImpl */, byteLength: Int = noImpl /* noImpl */) : ArrayBufferView {
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    fun getInt8(byteOffset: Int): Byte
    fun getUint8(byteOffset: Int): Byte
    fun getInt16(byteOffset: Int, littleEndian: Boolean = noImpl /* noImpl */): Short
    fun getUint16(byteOffset: Int, littleEndian: Boolean = noImpl /* noImpl */): Short
    fun getInt32(byteOffset: Int, littleEndian: Boolean = noImpl /* noImpl */): Int
    fun getUint32(byteOffset: Int, littleEndian: Boolean = noImpl /* noImpl */): Int
    fun getFloat32(byteOffset: Int, littleEndian: Boolean = noImpl /* noImpl */): Float
    fun getFloat64(byteOffset: Int, littleEndian: Boolean = noImpl /* noImpl */): Double
    fun setInt8(byteOffset: Int, value: Byte): Unit
    fun setUint8(byteOffset: Int, value: Byte): Unit
    fun setInt16(byteOffset: Int, value: Short, littleEndian: Boolean = noImpl /* noImpl */): Unit
    fun setUint16(byteOffset: Int, value: Short, littleEndian: Boolean = noImpl /* noImpl */): Unit
    fun setInt32(byteOffset: Int, value: Int, littleEndian: Boolean = noImpl /* noImpl */): Unit
    fun setUint32(byteOffset: Int, value: Int, littleEndian: Boolean = noImpl /* noImpl */): Unit
    fun setFloat32(byteOffset: Int, value: Float, littleEndian: Boolean = noImpl /* noImpl */): Unit
    fun setFloat64(byteOffset: Int, value: Double, littleEndian: Boolean = noImpl /* noImpl */): Unit
}

public external @marker interface BufferDataSource {
}

public external @marker interface TexImageSource {
}

