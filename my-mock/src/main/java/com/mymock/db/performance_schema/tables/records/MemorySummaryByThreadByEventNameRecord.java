/**
 * This class is generated by jOOQ
 */
package com.mymock.db.performance_schema.tables.records;


import com.mymock.db.performance_schema.tables.MemorySummaryByThreadByEventName;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
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
public class MemorySummaryByThreadByEventNameRecord extends TableRecordImpl<MemorySummaryByThreadByEventNameRecord> implements Record12<ULong, String, ULong, ULong, ULong, ULong, Long, Long, Long, Long, Long, Long> {

	private static final long serialVersionUID = -1986646146;

	/**
	 * Setter for <code>performance_schema.memory_summary_by_thread_by_event_name.THREAD_ID</code>.
	 */
	public void setThreadId(ULong value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>performance_schema.memory_summary_by_thread_by_event_name.THREAD_ID</code>.
	 */
	public ULong getThreadId() {
		return (ULong) getValue(0);
	}

	/**
	 * Setter for <code>performance_schema.memory_summary_by_thread_by_event_name.EVENT_NAME</code>.
	 */
	public void setEventName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>performance_schema.memory_summary_by_thread_by_event_name.EVENT_NAME</code>.
	 */
	public String getEventName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>performance_schema.memory_summary_by_thread_by_event_name.COUNT_ALLOC</code>.
	 */
	public void setCountAlloc(ULong value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>performance_schema.memory_summary_by_thread_by_event_name.COUNT_ALLOC</code>.
	 */
	public ULong getCountAlloc() {
		return (ULong) getValue(2);
	}

	/**
	 * Setter for <code>performance_schema.memory_summary_by_thread_by_event_name.COUNT_FREE</code>.
	 */
	public void setCountFree(ULong value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>performance_schema.memory_summary_by_thread_by_event_name.COUNT_FREE</code>.
	 */
	public ULong getCountFree() {
		return (ULong) getValue(3);
	}

	/**
	 * Setter for <code>performance_schema.memory_summary_by_thread_by_event_name.SUM_NUMBER_OF_BYTES_ALLOC</code>.
	 */
	public void setSumNumberOfBytesAlloc(ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>performance_schema.memory_summary_by_thread_by_event_name.SUM_NUMBER_OF_BYTES_ALLOC</code>.
	 */
	public ULong getSumNumberOfBytesAlloc() {
		return (ULong) getValue(4);
	}

	/**
	 * Setter for <code>performance_schema.memory_summary_by_thread_by_event_name.SUM_NUMBER_OF_BYTES_FREE</code>.
	 */
	public void setSumNumberOfBytesFree(ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>performance_schema.memory_summary_by_thread_by_event_name.SUM_NUMBER_OF_BYTES_FREE</code>.
	 */
	public ULong getSumNumberOfBytesFree() {
		return (ULong) getValue(5);
	}

	/**
	 * Setter for <code>performance_schema.memory_summary_by_thread_by_event_name.LOW_COUNT_USED</code>.
	 */
	public void setLowCountUsed(Long value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>performance_schema.memory_summary_by_thread_by_event_name.LOW_COUNT_USED</code>.
	 */
	public Long getLowCountUsed() {
		return (Long) getValue(6);
	}

	/**
	 * Setter for <code>performance_schema.memory_summary_by_thread_by_event_name.CURRENT_COUNT_USED</code>.
	 */
	public void setCurrentCountUsed(Long value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>performance_schema.memory_summary_by_thread_by_event_name.CURRENT_COUNT_USED</code>.
	 */
	public Long getCurrentCountUsed() {
		return (Long) getValue(7);
	}

	/**
	 * Setter for <code>performance_schema.memory_summary_by_thread_by_event_name.HIGH_COUNT_USED</code>.
	 */
	public void setHighCountUsed(Long value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>performance_schema.memory_summary_by_thread_by_event_name.HIGH_COUNT_USED</code>.
	 */
	public Long getHighCountUsed() {
		return (Long) getValue(8);
	}

	/**
	 * Setter for <code>performance_schema.memory_summary_by_thread_by_event_name.LOW_NUMBER_OF_BYTES_USED</code>.
	 */
	public void setLowNumberOfBytesUsed(Long value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>performance_schema.memory_summary_by_thread_by_event_name.LOW_NUMBER_OF_BYTES_USED</code>.
	 */
	public Long getLowNumberOfBytesUsed() {
		return (Long) getValue(9);
	}

	/**
	 * Setter for <code>performance_schema.memory_summary_by_thread_by_event_name.CURRENT_NUMBER_OF_BYTES_USED</code>.
	 */
	public void setCurrentNumberOfBytesUsed(Long value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>performance_schema.memory_summary_by_thread_by_event_name.CURRENT_NUMBER_OF_BYTES_USED</code>.
	 */
	public Long getCurrentNumberOfBytesUsed() {
		return (Long) getValue(10);
	}

	/**
	 * Setter for <code>performance_schema.memory_summary_by_thread_by_event_name.HIGH_NUMBER_OF_BYTES_USED</code>.
	 */
	public void setHighNumberOfBytesUsed(Long value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>performance_schema.memory_summary_by_thread_by_event_name.HIGH_NUMBER_OF_BYTES_USED</code>.
	 */
	public Long getHighNumberOfBytesUsed() {
		return (Long) getValue(11);
	}

	// -------------------------------------------------------------------------
	// Record12 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<ULong, String, ULong, ULong, ULong, ULong, Long, Long, Long, Long, Long, Long> fieldsRow() {
		return (Row12) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row12<ULong, String, ULong, ULong, ULong, ULong, Long, Long, Long, Long, Long, Long> valuesRow() {
		return (Row12) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field1() {
		return MemorySummaryByThreadByEventName.MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME.THREAD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return MemorySummaryByThreadByEventName.MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME.EVENT_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field3() {
		return MemorySummaryByThreadByEventName.MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME.COUNT_ALLOC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field4() {
		return MemorySummaryByThreadByEventName.MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME.COUNT_FREE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field5() {
		return MemorySummaryByThreadByEventName.MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME.SUM_NUMBER_OF_BYTES_ALLOC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field6() {
		return MemorySummaryByThreadByEventName.MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME.SUM_NUMBER_OF_BYTES_FREE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field7() {
		return MemorySummaryByThreadByEventName.MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME.LOW_COUNT_USED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field8() {
		return MemorySummaryByThreadByEventName.MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME.CURRENT_COUNT_USED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field9() {
		return MemorySummaryByThreadByEventName.MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME.HIGH_COUNT_USED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field10() {
		return MemorySummaryByThreadByEventName.MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME.LOW_NUMBER_OF_BYTES_USED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field11() {
		return MemorySummaryByThreadByEventName.MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME.CURRENT_NUMBER_OF_BYTES_USED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field12() {
		return MemorySummaryByThreadByEventName.MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME.HIGH_NUMBER_OF_BYTES_USED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value1() {
		return getThreadId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getEventName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value3() {
		return getCountAlloc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value4() {
		return getCountFree();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value5() {
		return getSumNumberOfBytesAlloc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value6() {
		return getSumNumberOfBytesFree();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value7() {
		return getLowCountUsed();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value8() {
		return getCurrentCountUsed();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value9() {
		return getHighCountUsed();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value10() {
		return getLowNumberOfBytesUsed();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value11() {
		return getCurrentNumberOfBytesUsed();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value12() {
		return getHighNumberOfBytesUsed();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemorySummaryByThreadByEventNameRecord value1(ULong value) {
		setThreadId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemorySummaryByThreadByEventNameRecord value2(String value) {
		setEventName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemorySummaryByThreadByEventNameRecord value3(ULong value) {
		setCountAlloc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemorySummaryByThreadByEventNameRecord value4(ULong value) {
		setCountFree(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemorySummaryByThreadByEventNameRecord value5(ULong value) {
		setSumNumberOfBytesAlloc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemorySummaryByThreadByEventNameRecord value6(ULong value) {
		setSumNumberOfBytesFree(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemorySummaryByThreadByEventNameRecord value7(Long value) {
		setLowCountUsed(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemorySummaryByThreadByEventNameRecord value8(Long value) {
		setCurrentCountUsed(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemorySummaryByThreadByEventNameRecord value9(Long value) {
		setHighCountUsed(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemorySummaryByThreadByEventNameRecord value10(Long value) {
		setLowNumberOfBytesUsed(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemorySummaryByThreadByEventNameRecord value11(Long value) {
		setCurrentNumberOfBytesUsed(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemorySummaryByThreadByEventNameRecord value12(Long value) {
		setHighNumberOfBytesUsed(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemorySummaryByThreadByEventNameRecord values(ULong value1, String value2, ULong value3, ULong value4, ULong value5, ULong value6, Long value7, Long value8, Long value9, Long value10, Long value11, Long value12) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MemorySummaryByThreadByEventNameRecord
	 */
	public MemorySummaryByThreadByEventNameRecord() {
		super(MemorySummaryByThreadByEventName.MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME);
	}

	/**
	 * Create a detached, initialised MemorySummaryByThreadByEventNameRecord
	 */
	public MemorySummaryByThreadByEventNameRecord(ULong threadId, String eventName, ULong countAlloc, ULong countFree, ULong sumNumberOfBytesAlloc, ULong sumNumberOfBytesFree, Long lowCountUsed, Long currentCountUsed, Long highCountUsed, Long lowNumberOfBytesUsed, Long currentNumberOfBytesUsed, Long highNumberOfBytesUsed) {
		super(MemorySummaryByThreadByEventName.MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME);

		setValue(0, threadId);
		setValue(1, eventName);
		setValue(2, countAlloc);
		setValue(3, countFree);
		setValue(4, sumNumberOfBytesAlloc);
		setValue(5, sumNumberOfBytesFree);
		setValue(6, lowCountUsed);
		setValue(7, currentCountUsed);
		setValue(8, highCountUsed);
		setValue(9, lowNumberOfBytesUsed);
		setValue(10, currentNumberOfBytesUsed);
		setValue(11, highNumberOfBytesUsed);
	}
}
