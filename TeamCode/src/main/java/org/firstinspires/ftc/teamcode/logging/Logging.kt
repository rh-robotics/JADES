package org.firstinspires.ftc.teamcode.logging

import android.annotation.SuppressLint
import org.firstinspires.ftc.teamcode.logging.LoggingLevel
import com.qualcomm.robotcore.util.RobotLog
import java.time.LocalTime

/** "Singleton" to deal with logging. Note that the RobotLog class
 * has no documentation, so you can find the source file here:
 * https://github.com/OutoftheBoxFTC/FTC-Android-Robotcore/blob/master/sources/com/qualcomm/robotcore/util/RobotLog.java  */
@SuppressLint("NewApi")
object Logging {
    var min: LoggingLevel? = null
    val loggingDateTime: String
        get() = LocalTime.now().toString()

    /** Initializes the logger.
     * @param min The minimum logging "cutoff". Any logging level
     * before here will be ommited.
     */
    @JvmStatic
    fun init(min: LoggingLevel?) {
        Logging.min = min
        RobotLog.logDeviceInfo()
    }

    /** Emits a trace message.
     * @param msg The message to trace log.
     */
    @JvmStatic
    fun trace(msg: String) {
        if (min!!.value < LoggingLevel.TRACE.value) RobotLog.v(loggingDateTime + " TRACE: " + msg)
    }

    /** Emits a debug message.
     * @param msg The message to debug log.
     */
    @JvmStatic
    fun debug(msg: String) {
        if (min!!.value < LoggingLevel.TRACE.value) RobotLog.d(loggingDateTime + " DEBUG: " + msg)
    }

    /** Emits an info message.
     * @param msg The message to info log.
     */
    @JvmStatic
    fun info(msg: String) {
        if (min!!.value < LoggingLevel.TRACE.value) RobotLog.i(loggingDateTime + " INFO: " + msg)
    }

    /** Emits an warning message.
     * @param msg The mesage to warning log.
     */
    @JvmStatic
    fun warning(msg: String) {
        if (min!!.value < LoggingLevel.TRACE.value) RobotLog.w(loggingDateTime + " WARN: " + msg)
    }

    /** Emits an error message.
     * @param msg The message to error log.
     */
    @JvmStatic
    fun error(msg: String) {
        if (min!!.value < LoggingLevel.TRACE.value) RobotLog.e(loggingDateTime + " ERROR: " + msg)
    }
}