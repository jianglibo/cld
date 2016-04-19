/**
 * This class is generated by jOOQ
 */
package com.mymock.db.information_schema.tables.records;


import com.mymock.db.information_schema.tables.InnodbCmpmem;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class InnodbCmpmemRecord extends TableRecordImpl<InnodbCmpmemRecord> implements Record6<Integer, Integer, Integer, Integer, Long, Integer> {

	private static final long serialVersionUID = 1829137010;

	/**
	 * Setter for <code>information_schema.INNODB_CMPMEM.page_size</code>.
	 */
	public void setPageSize(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_CMPMEM.page_size</code>.
	 */
	public Integer getPageSize() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.INNODB_CMPMEM.buffer_pool_instance</code>.
	 */
	public void setBufferPoolInstance(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_CMPMEM.buffer_pool_instance</code>.
	 */
	public Integer getBufferPoolInstance() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.INNODB_CMPMEM.pages_used</code>.
	 */
	public void setPagesUsed(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_CMPMEM.pages_used</code>.
	 */
	public Integer getPagesUsed() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.INNODB_CMPMEM.pages_free</code>.
	 */
	public void setPagesFree(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_CMPMEM.pages_free</code>.
	 */
	public Integer getPagesFree() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.INNODB_CMPMEM.relocation_ops</code>.
	 */
	public void setRelocationOps(Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_CMPMEM.relocation_ops</code>.
	 */
	public Long getRelocationOps() {
		return (Long) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.INNODB_CMPMEM.relocation_time</code>.
	 */
	public void setRelocationTime(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_CMPMEM.relocation_time</code>.
	 */
	public Integer getRelocationTime() {
		return (Integer) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, Integer, Integer, Integer, Long, Integer> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, Integer, Integer, Integer, Long, Integer> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return InnodbCmpmem.INNODB_CMPMEM.PAGE_SIZE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return InnodbCmpmem.INNODB_CMPMEM.BUFFER_POOL_INSTANCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return InnodbCmpmem.INNODB_CMPMEM.PAGES_USED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return InnodbCmpmem.INNODB_CMPMEM.PAGES_FREE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field5() {
		return InnodbCmpmem.INNODB_CMPMEM.RELOCATION_OPS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return InnodbCmpmem.INNODB_CMPMEM.RELOCATION_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getPageSize();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getBufferPoolInstance();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getPagesUsed();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getPagesFree();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value5() {
		return getRelocationOps();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getRelocationTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbCmpmemRecord value1(Integer value) {
		setPageSize(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbCmpmemRecord value2(Integer value) {
		setBufferPoolInstance(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbCmpmemRecord value3(Integer value) {
		setPagesUsed(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbCmpmemRecord value4(Integer value) {
		setPagesFree(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbCmpmemRecord value5(Long value) {
		setRelocationOps(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbCmpmemRecord value6(Integer value) {
		setRelocationTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbCmpmemRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Long value5, Integer value6) {
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
	 * Create a detached InnodbCmpmemRecord
	 */
	public InnodbCmpmemRecord() {
		super(InnodbCmpmem.INNODB_CMPMEM);
	}

	/**
	 * Create a detached, initialised InnodbCmpmemRecord
	 */
	public InnodbCmpmemRecord(Integer pageSize, Integer bufferPoolInstance, Integer pagesUsed, Integer pagesFree, Long relocationOps, Integer relocationTime) {
		super(InnodbCmpmem.INNODB_CMPMEM);

		setValue(0, pageSize);
		setValue(1, bufferPoolInstance);
		setValue(2, pagesUsed);
		setValue(3, pagesFree);
		setValue(4, relocationOps);
		setValue(5, relocationTime);
	}
}