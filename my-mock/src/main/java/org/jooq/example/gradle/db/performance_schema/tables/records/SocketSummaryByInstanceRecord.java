/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.performance_schema.tables.records;


import javax.annotation.Generated;

import org.jooq.example.gradle.db.performance_schema.tables.SocketSummaryByInstance;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SocketSummaryByInstanceRecord extends TableRecordImpl<SocketSummaryByInstanceRecord> {

	private static final long serialVersionUID = -1153630017;

	/**
	 * Setter for <code>performance_schema.socket_summary_by_instance.EVENT_NAME</code>.
	 */
	public void setEventName(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_instance.EVENT_NAME</code>.
	 */
	public String getEventName() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_instance.OBJECT_INSTANCE_BEGIN</code>.
	 */
	public void setObjectInstanceBegin(ULong value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_instance.OBJECT_INSTANCE_BEGIN</code>.
	 */
	public ULong getObjectInstanceBegin() {
		return (ULong) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_instance.COUNT_STAR</code>.
	 */
	public void setCountStar(ULong value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_instance.COUNT_STAR</code>.
	 */
	public ULong getCountStar() {
		return (ULong) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_instance.SUM_TIMER_WAIT</code>.
	 */
	public void setSumTimerWait(ULong value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_instance.SUM_TIMER_WAIT</code>.
	 */
	public ULong getSumTimerWait() {
		return (ULong) getValue(3);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_instance.MIN_TIMER_WAIT</code>.
	 */
	public void setMinTimerWait(ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_instance.MIN_TIMER_WAIT</code>.
	 */
	public ULong getMinTimerWait() {
		return (ULong) getValue(4);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_instance.AVG_TIMER_WAIT</code>.
	 */
	public void setAvgTimerWait(ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_instance.AVG_TIMER_WAIT</code>.
	 */
	public ULong getAvgTimerWait() {
		return (ULong) getValue(5);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_instance.MAX_TIMER_WAIT</code>.
	 */
	public void setMaxTimerWait(ULong value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_instance.MAX_TIMER_WAIT</code>.
	 */
	public ULong getMaxTimerWait() {
		return (ULong) getValue(6);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_instance.COUNT_READ</code>.
	 */
	public void setCountRead(ULong value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_instance.COUNT_READ</code>.
	 */
	public ULong getCountRead() {
		return (ULong) getValue(7);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_instance.SUM_TIMER_READ</code>.
	 */
	public void setSumTimerRead(ULong value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_instance.SUM_TIMER_READ</code>.
	 */
	public ULong getSumTimerRead() {
		return (ULong) getValue(8);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_instance.MIN_TIMER_READ</code>.
	 */
	public void setMinTimerRead(ULong value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_instance.MIN_TIMER_READ</code>.
	 */
	public ULong getMinTimerRead() {
		return (ULong) getValue(9);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_instance.AVG_TIMER_READ</code>.
	 */
	public void setAvgTimerRead(ULong value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_instance.AVG_TIMER_READ</code>.
	 */
	public ULong getAvgTimerRead() {
		return (ULong) getValue(10);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_instance.MAX_TIMER_READ</code>.
	 */
	public void setMaxTimerRead(ULong value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_instance.MAX_TIMER_READ</code>.
	 */
	public ULong getMaxTimerRead() {
		return (ULong) getValue(11);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_instance.SUM_NUMBER_OF_BYTES_READ</code>.
	 */
	public void setSumNumberOfBytesRead(ULong value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_instance.SUM_NUMBER_OF_BYTES_READ</code>.
	 */
	public ULong getSumNumberOfBytesRead() {
		return (ULong) getValue(12);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_instance.COUNT_WRITE</code>.
	 */
	public void setCountWrite(ULong value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_instance.COUNT_WRITE</code>.
	 */
	public ULong getCountWrite() {
		return (ULong) getValue(13);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_instance.SUM_TIMER_WRITE</code>.
	 */
	public void setSumTimerWrite(ULong value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_instance.SUM_TIMER_WRITE</code>.
	 */
	public ULong getSumTimerWrite() {
		return (ULong) getValue(14);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_instance.MIN_TIMER_WRITE</code>.
	 */
	public void setMinTimerWrite(ULong value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_instance.MIN_TIMER_WRITE</code>.
	 */
	public ULong getMinTimerWrite() {
		return (ULong) getValue(15);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_instance.AVG_TIMER_WRITE</code>.
	 */
	public void setAvgTimerWrite(ULong value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_instance.AVG_TIMER_WRITE</code>.
	 */
	public ULong getAvgTimerWrite() {
		return (ULong) getValue(16);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_instance.MAX_TIMER_WRITE</code>.
	 */
	public void setMaxTimerWrite(ULong value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_instance.MAX_TIMER_WRITE</code>.
	 */
	public ULong getMaxTimerWrite() {
		return (ULong) getValue(17);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_instance.SUM_NUMBER_OF_BYTES_WRITE</code>.
	 */
	public void setSumNumberOfBytesWrite(ULong value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_instance.SUM_NUMBER_OF_BYTES_WRITE</code>.
	 */
	public ULong getSumNumberOfBytesWrite() {
		return (ULong) getValue(18);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_instance.COUNT_MISC</code>.
	 */
	public void setCountMisc(ULong value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_instance.COUNT_MISC</code>.
	 */
	public ULong getCountMisc() {
		return (ULong) getValue(19);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_instance.SUM_TIMER_MISC</code>.
	 */
	public void setSumTimerMisc(ULong value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_instance.SUM_TIMER_MISC</code>.
	 */
	public ULong getSumTimerMisc() {
		return (ULong) getValue(20);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_instance.MIN_TIMER_MISC</code>.
	 */
	public void setMinTimerMisc(ULong value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_instance.MIN_TIMER_MISC</code>.
	 */
	public ULong getMinTimerMisc() {
		return (ULong) getValue(21);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_instance.AVG_TIMER_MISC</code>.
	 */
	public void setAvgTimerMisc(ULong value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_instance.AVG_TIMER_MISC</code>.
	 */
	public ULong getAvgTimerMisc() {
		return (ULong) getValue(22);
	}

	/**
	 * Setter for <code>performance_schema.socket_summary_by_instance.MAX_TIMER_MISC</code>.
	 */
	public void setMaxTimerMisc(ULong value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>performance_schema.socket_summary_by_instance.MAX_TIMER_MISC</code>.
	 */
	public ULong getMaxTimerMisc() {
		return (ULong) getValue(23);
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SocketSummaryByInstanceRecord
	 */
	public SocketSummaryByInstanceRecord() {
		super(SocketSummaryByInstance.SOCKET_SUMMARY_BY_INSTANCE);
	}

	/**
	 * Create a detached, initialised SocketSummaryByInstanceRecord
	 */
	public SocketSummaryByInstanceRecord(String eventName, ULong objectInstanceBegin, ULong countStar, ULong sumTimerWait, ULong minTimerWait, ULong avgTimerWait, ULong maxTimerWait, ULong countRead, ULong sumTimerRead, ULong minTimerRead, ULong avgTimerRead, ULong maxTimerRead, ULong sumNumberOfBytesRead, ULong countWrite, ULong sumTimerWrite, ULong minTimerWrite, ULong avgTimerWrite, ULong maxTimerWrite, ULong sumNumberOfBytesWrite, ULong countMisc, ULong sumTimerMisc, ULong minTimerMisc, ULong avgTimerMisc, ULong maxTimerMisc) {
		super(SocketSummaryByInstance.SOCKET_SUMMARY_BY_INSTANCE);

		setValue(0, eventName);
		setValue(1, objectInstanceBegin);
		setValue(2, countStar);
		setValue(3, sumTimerWait);
		setValue(4, minTimerWait);
		setValue(5, avgTimerWait);
		setValue(6, maxTimerWait);
		setValue(7, countRead);
		setValue(8, sumTimerRead);
		setValue(9, minTimerRead);
		setValue(10, avgTimerRead);
		setValue(11, maxTimerRead);
		setValue(12, sumNumberOfBytesRead);
		setValue(13, countWrite);
		setValue(14, sumTimerWrite);
		setValue(15, minTimerWrite);
		setValue(16, avgTimerWrite);
		setValue(17, maxTimerWrite);
		setValue(18, sumNumberOfBytesWrite);
		setValue(19, countMisc);
		setValue(20, sumTimerMisc);
		setValue(21, minTimerMisc);
		setValue(22, avgTimerMisc);
		setValue(23, maxTimerMisc);
	}
}
