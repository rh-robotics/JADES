package org.firstinspires.ftc.teamcode.logging

/** A logging level.  */
enum class LoggingLevel
    /** Gets the value of the logging level. Used for the cutoff code.  */
    (val value: Int) {
        TRACE(0), DEBUG(1), INFO(2), WARNING(3), ERROR(4);
    }