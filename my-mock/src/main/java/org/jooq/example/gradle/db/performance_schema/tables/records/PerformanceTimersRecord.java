/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.performance_schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.example.gradle.db.performance_schema.enums.PerformanceTimersTimerName;
import org.jooq.example.gradle.db.performance_schema.tables.PerformanceTimers;
import org.jooq.impl.TableRecordImpl;


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
public class PerformanceTimersRecord extends TableRecordImpl<PerformanceTimersRecord> implements Record4<PerformanceTimersTimerName, Long, Long, Long> {

	private static final long serialVersionUID = 1281533358;

	/**
	 * Setter for <code>performance_schema.performance_timers.TIMER_NAME</code>.
	 */
	public void setTimerName(PerformanceTimersTimerName value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.performance_timers.TIMER_NAME</code>.
	 */
	public PerformanceTimersTimerName getTimerName() {
		return (PerformanceTimersTimerName) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.performance_timers.TIMER_FREQUENCY</code>.
	 */
	public void setTimerFrequency(Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.performance_timers.TIMER_FREQUENCY</code>.
	 */
	public Long getTimerFrequency() {
		return (Long) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.performance_timers.TIMER_RESOLUTION</code>.
	 */
	public void setTimerResolution(Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.performance_timers.TIMER_RESOLUTION</code>.
	 */
	public Long getTimerResolution() {
		return (Long) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.performance_timers.TIMER_OVERHEAD</code>.
	 */
	public void setTimerOverhead(Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.performance_timers.TIMER_OVERHEAD</code>.
	 */
	public Long getTimerOverhead() {
		return (Long) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<PerformanceTimersTimerName, Long, Long, Long> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<PerformanceTimersTimerName, Long, Long, Long> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<PerformanceTimersTimerName> field1() {
		return PerformanceTimers.PERFORMANCE_TIMERS.TIMER_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field2() {
		return PerformanceTimers.PERFORMANCE_TIMERS.TIMER_FREQUENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field3() {
		return PerformanceTimers.PERFORMANCE_TIMERS.TIMER_RESOLUTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field4() {
		return PerformanceTimers.PERFORMANCE_TIMERS.TIMER_OVERHEAD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PerformanceTimersTimerName value1() {
		return getTimerName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value2() {
		return getTimerFrequency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value3() {
		return getTimerResolution();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value4() {
		return getTimerOverhead();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PerformanceTimersRecord value1(PerformanceTimersTimerName value) {
		setTimerName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PerformanceTimersRecord value2(Long value) {
		setTimerFrequency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PerformanceTimersRecord value3(Long value) {
		setTimerResolution(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PerformanceTimersRecord value4(Long value) {
		setTimerOverhead(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PerformanceTimersRecord values(PerformanceTimersTimerName value1, Long value2, Long value3, Long value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PerformanceTimersRecord
	 */
	public PerformanceTimersRecord() {
		super(PerformanceTimers.PERFORMANCE_TIMERS);
	}

	/**
	 * Create a detached, initialised PerformanceTimersRecord
	 */
	public PerformanceTimersRecord(PerformanceTimersTimerName timerName, Long timerFrequency, Long timerResolution, Long timerOverhead) {
		super(PerformanceTimers.PERFORMANCE_TIMERS);

		setValue(0, timerName);
		setValue(1, timerFrequency);
		setValue(2, timerResolution);
		setValue(3, timerOverhead);
	}
}
