/**
 * This class is generated by jOOQ
 */
package com.mymock.db.sys.tables.records;


import com.mymock.db.sys.tables.IoGlobalByFileByBytes;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


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
public class IoGlobalByFileByBytesRecord extends TableRecordImpl<IoGlobalByFileByBytesRecord> implements Record9<String, ULong, String, String, ULong, String, String, String, BigDecimal> {

	private static final long serialVersionUID = 487822568;

	/**
	 * Setter for <code>sys.io_global_by_file_by_bytes.file</code>.
	 */
	public void setFile(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sys.io_global_by_file_by_bytes.file</code>.
	 */
	public String getFile() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>sys.io_global_by_file_by_bytes.count_read</code>.
	 */
	public void setCountRead(ULong value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sys.io_global_by_file_by_bytes.count_read</code>.
	 */
	public ULong getCountRead() {
		return (ULong) getValue(1);
	}

	/**
	 * Setter for <code>sys.io_global_by_file_by_bytes.total_read</code>.
	 */
	public void setTotalRead(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sys.io_global_by_file_by_bytes.total_read</code>.
	 */
	public String getTotalRead() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>sys.io_global_by_file_by_bytes.avg_read</code>.
	 */
	public void setAvgRead(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sys.io_global_by_file_by_bytes.avg_read</code>.
	 */
	public String getAvgRead() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>sys.io_global_by_file_by_bytes.count_write</code>.
	 */
	public void setCountWrite(ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sys.io_global_by_file_by_bytes.count_write</code>.
	 */
	public ULong getCountWrite() {
		return (ULong) getValue(4);
	}

	/**
	 * Setter for <code>sys.io_global_by_file_by_bytes.total_written</code>.
	 */
	public void setTotalWritten(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>sys.io_global_by_file_by_bytes.total_written</code>.
	 */
	public String getTotalWritten() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>sys.io_global_by_file_by_bytes.avg_write</code>.
	 */
	public void setAvgWrite(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>sys.io_global_by_file_by_bytes.avg_write</code>.
	 */
	public String getAvgWrite() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>sys.io_global_by_file_by_bytes.total</code>.
	 */
	public void setTotal(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>sys.io_global_by_file_by_bytes.total</code>.
	 */
	public String getTotal() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>sys.io_global_by_file_by_bytes.write_pct</code>.
	 */
	public void setWritePct(BigDecimal value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>sys.io_global_by_file_by_bytes.write_pct</code>.
	 */
	public BigDecimal getWritePct() {
		return (BigDecimal) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<String, ULong, String, String, ULong, String, String, String, BigDecimal> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<String, ULong, String, String, ULong, String, String, String, BigDecimal> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return IoGlobalByFileByBytes.IO_GLOBAL_BY_FILE_BY_BYTES.FILE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field2() {
		return IoGlobalByFileByBytes.IO_GLOBAL_BY_FILE_BY_BYTES.COUNT_READ;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return IoGlobalByFileByBytes.IO_GLOBAL_BY_FILE_BY_BYTES.TOTAL_READ;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return IoGlobalByFileByBytes.IO_GLOBAL_BY_FILE_BY_BYTES.AVG_READ;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field5() {
		return IoGlobalByFileByBytes.IO_GLOBAL_BY_FILE_BY_BYTES.COUNT_WRITE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return IoGlobalByFileByBytes.IO_GLOBAL_BY_FILE_BY_BYTES.TOTAL_WRITTEN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return IoGlobalByFileByBytes.IO_GLOBAL_BY_FILE_BY_BYTES.AVG_WRITE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return IoGlobalByFileByBytes.IO_GLOBAL_BY_FILE_BY_BYTES.TOTAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field9() {
		return IoGlobalByFileByBytes.IO_GLOBAL_BY_FILE_BY_BYTES.WRITE_PCT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getFile();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value2() {
		return getCountRead();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getTotalRead();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getAvgRead();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value5() {
		return getCountWrite();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getTotalWritten();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getAvgWrite();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getTotal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value9() {
		return getWritePct();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IoGlobalByFileByBytesRecord value1(String value) {
		setFile(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IoGlobalByFileByBytesRecord value2(ULong value) {
		setCountRead(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IoGlobalByFileByBytesRecord value3(String value) {
		setTotalRead(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IoGlobalByFileByBytesRecord value4(String value) {
		setAvgRead(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IoGlobalByFileByBytesRecord value5(ULong value) {
		setCountWrite(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IoGlobalByFileByBytesRecord value6(String value) {
		setTotalWritten(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IoGlobalByFileByBytesRecord value7(String value) {
		setAvgWrite(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IoGlobalByFileByBytesRecord value8(String value) {
		setTotal(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IoGlobalByFileByBytesRecord value9(BigDecimal value) {
		setWritePct(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IoGlobalByFileByBytesRecord values(String value1, ULong value2, String value3, String value4, ULong value5, String value6, String value7, String value8, BigDecimal value9) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached IoGlobalByFileByBytesRecord
	 */
	public IoGlobalByFileByBytesRecord() {
		super(IoGlobalByFileByBytes.IO_GLOBAL_BY_FILE_BY_BYTES);
	}

	/**
	 * Create a detached, initialised IoGlobalByFileByBytesRecord
	 */
	public IoGlobalByFileByBytesRecord(String file, ULong countRead, String totalRead, String avgRead, ULong countWrite, String totalWritten, String avgWrite, String total, BigDecimal writePct) {
		super(IoGlobalByFileByBytes.IO_GLOBAL_BY_FILE_BY_BYTES);

		setValue(0, file);
		setValue(1, countRead);
		setValue(2, totalRead);
		setValue(3, avgRead);
		setValue(4, countWrite);
		setValue(5, totalWritten);
		setValue(6, avgWrite);
		setValue(7, total);
		setValue(8, writePct);
	}
}
