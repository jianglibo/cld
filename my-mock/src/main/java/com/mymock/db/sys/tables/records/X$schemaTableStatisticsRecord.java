/**
 * This class is generated by jOOQ
 */
package com.mymock.db.sys.tables.records;


import com.mymock.db.sys.tables.X$schemaTableStatistics;

import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record19;
import org.jooq.Row19;
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
public class X$schemaTableStatisticsRecord extends TableRecordImpl<X$schemaTableStatisticsRecord> implements Record19<String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger> {

	private static final long serialVersionUID = 753662216;

	/**
	 * Setter for <code>sys.x$schema_table_statistics.table_schema</code>.
	 */
	public void setTableSchema(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics.table_schema</code>.
	 */
	public String getTableSchema() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics.table_name</code>.
	 */
	public void setTableName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics.table_name</code>.
	 */
	public String getTableName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics.total_latency</code>.
	 */
	public void setTotalLatency(ULong value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics.total_latency</code>.
	 */
	public ULong getTotalLatency() {
		return (ULong) getValue(2);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics.rows_fetched</code>.
	 */
	public void setRowsFetched(ULong value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics.rows_fetched</code>.
	 */
	public ULong getRowsFetched() {
		return (ULong) getValue(3);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics.fetch_latency</code>.
	 */
	public void setFetchLatency(ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics.fetch_latency</code>.
	 */
	public ULong getFetchLatency() {
		return (ULong) getValue(4);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics.rows_inserted</code>.
	 */
	public void setRowsInserted(ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics.rows_inserted</code>.
	 */
	public ULong getRowsInserted() {
		return (ULong) getValue(5);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics.insert_latency</code>.
	 */
	public void setInsertLatency(ULong value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics.insert_latency</code>.
	 */
	public ULong getInsertLatency() {
		return (ULong) getValue(6);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics.rows_updated</code>.
	 */
	public void setRowsUpdated(ULong value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics.rows_updated</code>.
	 */
	public ULong getRowsUpdated() {
		return (ULong) getValue(7);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics.update_latency</code>.
	 */
	public void setUpdateLatency(ULong value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics.update_latency</code>.
	 */
	public ULong getUpdateLatency() {
		return (ULong) getValue(8);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics.rows_deleted</code>.
	 */
	public void setRowsDeleted(ULong value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics.rows_deleted</code>.
	 */
	public ULong getRowsDeleted() {
		return (ULong) getValue(9);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics.delete_latency</code>.
	 */
	public void setDeleteLatency(ULong value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics.delete_latency</code>.
	 */
	public ULong getDeleteLatency() {
		return (ULong) getValue(10);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics.io_read_requests</code>.
	 */
	public void setIoReadRequests(BigInteger value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics.io_read_requests</code>.
	 */
	public BigInteger getIoReadRequests() {
		return (BigInteger) getValue(11);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics.io_read</code>.
	 */
	public void setIoRead(BigInteger value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics.io_read</code>.
	 */
	public BigInteger getIoRead() {
		return (BigInteger) getValue(12);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics.io_read_latency</code>.
	 */
	public void setIoReadLatency(BigInteger value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics.io_read_latency</code>.
	 */
	public BigInteger getIoReadLatency() {
		return (BigInteger) getValue(13);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics.io_write_requests</code>.
	 */
	public void setIoWriteRequests(BigInteger value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics.io_write_requests</code>.
	 */
	public BigInteger getIoWriteRequests() {
		return (BigInteger) getValue(14);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics.io_write</code>.
	 */
	public void setIoWrite(BigInteger value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics.io_write</code>.
	 */
	public BigInteger getIoWrite() {
		return (BigInteger) getValue(15);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics.io_write_latency</code>.
	 */
	public void setIoWriteLatency(BigInteger value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics.io_write_latency</code>.
	 */
	public BigInteger getIoWriteLatency() {
		return (BigInteger) getValue(16);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics.io_misc_requests</code>.
	 */
	public void setIoMiscRequests(BigInteger value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics.io_misc_requests</code>.
	 */
	public BigInteger getIoMiscRequests() {
		return (BigInteger) getValue(17);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics.io_misc_latency</code>.
	 */
	public void setIoMiscLatency(BigInteger value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics.io_misc_latency</code>.
	 */
	public BigInteger getIoMiscLatency() {
		return (BigInteger) getValue(18);
	}

	// -------------------------------------------------------------------------
	// Record19 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row19<String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger> fieldsRow() {
		return (Row19) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row19<String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, ULong, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger> valuesRow() {
		return (Row19) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return X$schemaTableStatistics.X$SCHEMA_TABLE_STATISTICS.TABLE_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return X$schemaTableStatistics.X$SCHEMA_TABLE_STATISTICS.TABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field3() {
		return X$schemaTableStatistics.X$SCHEMA_TABLE_STATISTICS.TOTAL_LATENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field4() {
		return X$schemaTableStatistics.X$SCHEMA_TABLE_STATISTICS.ROWS_FETCHED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field5() {
		return X$schemaTableStatistics.X$SCHEMA_TABLE_STATISTICS.FETCH_LATENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field6() {
		return X$schemaTableStatistics.X$SCHEMA_TABLE_STATISTICS.ROWS_INSERTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field7() {
		return X$schemaTableStatistics.X$SCHEMA_TABLE_STATISTICS.INSERT_LATENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field8() {
		return X$schemaTableStatistics.X$SCHEMA_TABLE_STATISTICS.ROWS_UPDATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field9() {
		return X$schemaTableStatistics.X$SCHEMA_TABLE_STATISTICS.UPDATE_LATENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field10() {
		return X$schemaTableStatistics.X$SCHEMA_TABLE_STATISTICS.ROWS_DELETED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field11() {
		return X$schemaTableStatistics.X$SCHEMA_TABLE_STATISTICS.DELETE_LATENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field12() {
		return X$schemaTableStatistics.X$SCHEMA_TABLE_STATISTICS.IO_READ_REQUESTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field13() {
		return X$schemaTableStatistics.X$SCHEMA_TABLE_STATISTICS.IO_READ;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field14() {
		return X$schemaTableStatistics.X$SCHEMA_TABLE_STATISTICS.IO_READ_LATENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field15() {
		return X$schemaTableStatistics.X$SCHEMA_TABLE_STATISTICS.IO_WRITE_REQUESTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field16() {
		return X$schemaTableStatistics.X$SCHEMA_TABLE_STATISTICS.IO_WRITE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field17() {
		return X$schemaTableStatistics.X$SCHEMA_TABLE_STATISTICS.IO_WRITE_LATENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field18() {
		return X$schemaTableStatistics.X$SCHEMA_TABLE_STATISTICS.IO_MISC_REQUESTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigInteger> field19() {
		return X$schemaTableStatistics.X$SCHEMA_TABLE_STATISTICS.IO_MISC_LATENCY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getTableSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getTableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value3() {
		return getTotalLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value4() {
		return getRowsFetched();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value5() {
		return getFetchLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value6() {
		return getRowsInserted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value7() {
		return getInsertLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value8() {
		return getRowsUpdated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value9() {
		return getUpdateLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value10() {
		return getRowsDeleted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value11() {
		return getDeleteLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value12() {
		return getIoReadRequests();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value13() {
		return getIoRead();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value14() {
		return getIoReadLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value15() {
		return getIoWriteRequests();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value16() {
		return getIoWrite();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value17() {
		return getIoWriteLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value18() {
		return getIoMiscRequests();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigInteger value19() {
		return getIoMiscLatency();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableStatisticsRecord value1(String value) {
		setTableSchema(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableStatisticsRecord value2(String value) {
		setTableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableStatisticsRecord value3(ULong value) {
		setTotalLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableStatisticsRecord value4(ULong value) {
		setRowsFetched(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableStatisticsRecord value5(ULong value) {
		setFetchLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableStatisticsRecord value6(ULong value) {
		setRowsInserted(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableStatisticsRecord value7(ULong value) {
		setInsertLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableStatisticsRecord value8(ULong value) {
		setRowsUpdated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableStatisticsRecord value9(ULong value) {
		setUpdateLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableStatisticsRecord value10(ULong value) {
		setRowsDeleted(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableStatisticsRecord value11(ULong value) {
		setDeleteLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableStatisticsRecord value12(BigInteger value) {
		setIoReadRequests(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableStatisticsRecord value13(BigInteger value) {
		setIoRead(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableStatisticsRecord value14(BigInteger value) {
		setIoReadLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableStatisticsRecord value15(BigInteger value) {
		setIoWriteRequests(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableStatisticsRecord value16(BigInteger value) {
		setIoWrite(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableStatisticsRecord value17(BigInteger value) {
		setIoWriteLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableStatisticsRecord value18(BigInteger value) {
		setIoMiscRequests(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableStatisticsRecord value19(BigInteger value) {
		setIoMiscLatency(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$schemaTableStatisticsRecord values(String value1, String value2, ULong value3, ULong value4, ULong value5, ULong value6, ULong value7, ULong value8, ULong value9, ULong value10, ULong value11, BigInteger value12, BigInteger value13, BigInteger value14, BigInteger value15, BigInteger value16, BigInteger value17, BigInteger value18, BigInteger value19) {
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
		value13(value13);
		value14(value14);
		value15(value15);
		value16(value16);
		value17(value17);
		value18(value18);
		value19(value19);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached X$schemaTableStatisticsRecord
	 */
	public X$schemaTableStatisticsRecord() {
		super(X$schemaTableStatistics.X$SCHEMA_TABLE_STATISTICS);
	}

	/**
	 * Create a detached, initialised X$schemaTableStatisticsRecord
	 */
	public X$schemaTableStatisticsRecord(String tableSchema, String tableName, ULong totalLatency, ULong rowsFetched, ULong fetchLatency, ULong rowsInserted, ULong insertLatency, ULong rowsUpdated, ULong updateLatency, ULong rowsDeleted, ULong deleteLatency, BigInteger ioReadRequests, BigInteger ioRead, BigInteger ioReadLatency, BigInteger ioWriteRequests, BigInteger ioWrite, BigInteger ioWriteLatency, BigInteger ioMiscRequests, BigInteger ioMiscLatency) {
		super(X$schemaTableStatistics.X$SCHEMA_TABLE_STATISTICS);

		setValue(0, tableSchema);
		setValue(1, tableName);
		setValue(2, totalLatency);
		setValue(3, rowsFetched);
		setValue(4, fetchLatency);
		setValue(5, rowsInserted);
		setValue(6, insertLatency);
		setValue(7, rowsUpdated);
		setValue(8, updateLatency);
		setValue(9, rowsDeleted);
		setValue(10, deleteLatency);
		setValue(11, ioReadRequests);
		setValue(12, ioRead);
		setValue(13, ioReadLatency);
		setValue(14, ioWriteRequests);
		setValue(15, ioWrite);
		setValue(16, ioWriteLatency);
		setValue(17, ioMiscRequests);
		setValue(18, ioMiscLatency);
	}
}
