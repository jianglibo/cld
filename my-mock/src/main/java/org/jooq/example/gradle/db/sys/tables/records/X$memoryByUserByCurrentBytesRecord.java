/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.sys.tables.records;


import java.math.BigDecimal;
import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.example.gradle.db.sys.tables.X$memoryByUserByCurrentBytes;
import org.jooq.impl.TableRecordImpl;


/**
 * VIEW
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class X$memoryByUserByCurrentBytesRecord extends TableRecordImpl<X$memoryByUserByCurrentBytesRecord> implements Record6<String, BigInteger, BigInteger, BigDecimal, Long, BigInteger> {

	private static final long serialVersionUID = -274674434;

	/**
	 * Setter for <code>sys.x$memory_by_user_by_current_bytes.user</code>.
	 */
	public void setUser(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sys.x$memory_by_user_by_current_bytes.user</code>.
	 */
	public String getUser() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>sys.x$memory_by_user_by_current_bytes.current_count_used</code>.
	 */
	public void setCurrentCountUsed(BigInteger value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sys.x$memory_by_user_by_current_bytes.current_count_used</code>.
	 */
	public BigInteger getCurrentCountUsed() {
		return (BigInteger) getValue(1);
	}

	/**
	 * Setter for <code>sys.x$memory_by_user_by_current_bytes.current_allocated</code>.
	 */
	public void setCurrentAllocated(BigInteger value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sys.x$memory_by_user_by_current_bytes.current_allocated</code>.
	 */
	public BigInteger getCurrentAllocated() {
		return (BigInteger) getValue(2);
	}

	/**
	 * Setter for <code>sys.x$memory_by_user_by_current_bytes.current_avg_alloc</code>.
	 */
	public void setCurrentAvgAlloc(BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sys.x$memory_by_user_by_current_bytes.current_avg_alloc</code>.
	 */
	public BigDecimal getCurrentAvgAlloc() {
		return (BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>sys.x$memory_by_user_by_current_bytes.current_max_alloc</code>.
	 */
	public void setCurrentMaxAlloc(Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sys.x$memory_by_user_by_current_bytes.current_max_alloc</code>.
	 */
	public Long getCurrentMaxAlloc() {
		return (Long) getValue(4);
	}

	/**
	 * Setter for <code>sys.x$memory_by_user_by_current_bytes.total_allocated</code>.
	 */
	public void setTotalAllocated(BigInteger value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>sys.x$memory_by_user_by_current_bytes.total_allocated</code>.
	 */
	public BigInteger getTotalAllocated() {
		return (BigInteger) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, BigInteger, BigInteger, BigDecimal, Long, BigInteger> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, BigInteger, BigInteger, BigDecimal, Long, BigInteger> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return X$memoryByUserByCurrentBytes.X$MEMORY_BY_USER_BY_CURRENT_BYTES.USER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field2() {
		return X$memoryByUserByCurrentBytes.X$MEMORY_BY_USER_BY_CURRENT_BYTES.CURRENT_COUNT_USED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field3() {
		return X$memoryByUserByCurrentBytes.X$MEMORY_BY_USER_BY_CURRENT_BYTES.CURRENT_ALLOCATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field4() {
		return X$memoryByUserByCurrentBytes.X$MEMORY_BY_USER_BY_CURRENT_BYTES.CURRENT_AVG_ALLOC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field5() {
		return X$memoryByUserByCurrentBytes.X$MEMORY_BY_USER_BY_CURRENT_BYTES.CURRENT_MAX_ALLOC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field6() {
		return X$memoryByUserByCurrentBytes.X$MEMORY_BY_USER_BY_CURRENT_BYTES.TOTAL_ALLOCATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value2() {
		return getCurrentCountUsed();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value3() {
		return getCurrentAllocated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value4() {
		return getCurrentAvgAlloc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value5() {
		return getCurrentMaxAlloc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value6() {
		return getTotalAllocated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$memoryByUserByCurrentBytesRecord value1(String value) {
		setUser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$memoryByUserByCurrentBytesRecord value2(BigInteger value) {
		setCurrentCountUsed(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$memoryByUserByCurrentBytesRecord value3(BigInteger value) {
		setCurrentAllocated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$memoryByUserByCurrentBytesRecord value4(BigDecimal value) {
		setCurrentAvgAlloc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$memoryByUserByCurrentBytesRecord value5(Long value) {
		setCurrentMaxAlloc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$memoryByUserByCurrentBytesRecord value6(BigInteger value) {
		setTotalAllocated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$memoryByUserByCurrentBytesRecord values(String value1, BigInteger value2, BigInteger value3, BigDecimal value4, Long value5, BigInteger value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached X$memoryByUserByCurrentBytesRecord
	 */
	public X$memoryByUserByCurrentBytesRecord() {
		super(X$memoryByUserByCurrentBytes.X$MEMORY_BY_USER_BY_CURRENT_BYTES);
	}

	/**
	 * Create a detached, initialised X$memoryByUserByCurrentBytesRecord
	 */
	public X$memoryByUserByCurrentBytesRecord(String user, BigInteger currentCountUsed, BigInteger currentAllocated, BigDecimal currentAvgAlloc, Long currentMaxAlloc, BigInteger totalAllocated) {
		super(X$memoryByUserByCurrentBytes.X$MEMORY_BY_USER_BY_CURRENT_BYTES);

		setValue(0, user);
		setValue(1, currentCountUsed);
		setValue(2, currentAllocated);
		setValue(3, currentAvgAlloc);
		setValue(4, currentMaxAlloc);
		setValue(5, totalAllocated);
	}
}
