/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.sys.tables.records;


import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.example.gradle.db.sys.tables.X$schemaTableStatisticsWithBuffer;
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
public class X$schemaTableStatisticsWithBufferRecord extends TableRecordImpl<X$schemaTableStatisticsWithBufferRecord> {

	private static final long serialVersionUID = 1226894940;

	/**
	 * Setter for <code>sys.x$schema_table_statistics_with_buffer.table_schema</code>.
	 */
	public void setTableSchema(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics_with_buffer.table_schema</code>.
	 */
	public String getTableSchema() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics_with_buffer.table_name</code>.
	 */
	public void setTableName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics_with_buffer.table_name</code>.
	 */
	public String getTableName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics_with_buffer.rows_fetched</code>.
	 */
	public void setRowsFetched(ULong value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics_with_buffer.rows_fetched</code>.
	 */
	public ULong getRowsFetched() {
		return (ULong) getValue(2);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics_with_buffer.fetch_latency</code>.
	 */
	public void setFetchLatency(ULong value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics_with_buffer.fetch_latency</code>.
	 */
	public ULong getFetchLatency() {
		return (ULong) getValue(3);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics_with_buffer.rows_inserted</code>.
	 */
	public void setRowsInserted(ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics_with_buffer.rows_inserted</code>.
	 */
	public ULong getRowsInserted() {
		return (ULong) getValue(4);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics_with_buffer.insert_latency</code>.
	 */
	public void setInsertLatency(ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics_with_buffer.insert_latency</code>.
	 */
	public ULong getInsertLatency() {
		return (ULong) getValue(5);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics_with_buffer.rows_updated</code>.
	 */
	public void setRowsUpdated(ULong value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics_with_buffer.rows_updated</code>.
	 */
	public ULong getRowsUpdated() {
		return (ULong) getValue(6);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics_with_buffer.update_latency</code>.
	 */
	public void setUpdateLatency(ULong value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics_with_buffer.update_latency</code>.
	 */
	public ULong getUpdateLatency() {
		return (ULong) getValue(7);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics_with_buffer.rows_deleted</code>.
	 */
	public void setRowsDeleted(ULong value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics_with_buffer.rows_deleted</code>.
	 */
	public ULong getRowsDeleted() {
		return (ULong) getValue(8);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics_with_buffer.delete_latency</code>.
	 */
	public void setDeleteLatency(ULong value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics_with_buffer.delete_latency</code>.
	 */
	public ULong getDeleteLatency() {
		return (ULong) getValue(9);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics_with_buffer.io_read_requests</code>.
	 */
	public void setIoReadRequests(BigInteger value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics_with_buffer.io_read_requests</code>.
	 */
	public BigInteger getIoReadRequests() {
		return (BigInteger) getValue(10);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics_with_buffer.io_read</code>.
	 */
	public void setIoRead(BigInteger value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics_with_buffer.io_read</code>.
	 */
	public BigInteger getIoRead() {
		return (BigInteger) getValue(11);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics_with_buffer.io_read_latency</code>.
	 */
	public void setIoReadLatency(BigInteger value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics_with_buffer.io_read_latency</code>.
	 */
	public BigInteger getIoReadLatency() {
		return (BigInteger) getValue(12);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics_with_buffer.io_write_requests</code>.
	 */
	public void setIoWriteRequests(BigInteger value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics_with_buffer.io_write_requests</code>.
	 */
	public BigInteger getIoWriteRequests() {
		return (BigInteger) getValue(13);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics_with_buffer.io_write</code>.
	 */
	public void setIoWrite(BigInteger value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics_with_buffer.io_write</code>.
	 */
	public BigInteger getIoWrite() {
		return (BigInteger) getValue(14);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics_with_buffer.io_write_latency</code>.
	 */
	public void setIoWriteLatency(BigInteger value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics_with_buffer.io_write_latency</code>.
	 */
	public BigInteger getIoWriteLatency() {
		return (BigInteger) getValue(15);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics_with_buffer.io_misc_requests</code>.
	 */
	public void setIoMiscRequests(BigInteger value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics_with_buffer.io_misc_requests</code>.
	 */
	public BigInteger getIoMiscRequests() {
		return (BigInteger) getValue(16);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics_with_buffer.io_misc_latency</code>.
	 */
	public void setIoMiscLatency(BigInteger value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics_with_buffer.io_misc_latency</code>.
	 */
	public BigInteger getIoMiscLatency() {
		return (BigInteger) getValue(17);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_allocated</code>.
	 */
	public void setInnodbBufferAllocated(BigInteger value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_allocated</code>.
	 */
	public BigInteger getInnodbBufferAllocated() {
		return (BigInteger) getValue(18);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_data</code>.
	 */
	public void setInnodbBufferData(BigInteger value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_data</code>.
	 */
	public BigInteger getInnodbBufferData() {
		return (BigInteger) getValue(19);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_free</code>.
	 */
	public void setInnodbBufferFree(BigInteger value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_free</code>.
	 */
	public BigInteger getInnodbBufferFree() {
		return (BigInteger) getValue(20);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_pages</code>.
	 */
	public void setInnodbBufferPages(Long value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_pages</code>.
	 */
	public Long getInnodbBufferPages() {
		return (Long) getValue(21);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_pages_hashed</code>.
	 */
	public void setInnodbBufferPagesHashed(Long value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_pages_hashed</code>.
	 */
	public Long getInnodbBufferPagesHashed() {
		return (Long) getValue(22);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_pages_old</code>.
	 */
	public void setInnodbBufferPagesOld(Long value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_pages_old</code>.
	 */
	public Long getInnodbBufferPagesOld() {
		return (Long) getValue(23);
	}

	/**
	 * Setter for <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_rows_cached</code>.
	 */
	public void setInnodbBufferRowsCached(BigInteger value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>sys.x$schema_table_statistics_with_buffer.innodb_buffer_rows_cached</code>.
	 */
	public BigInteger getInnodbBufferRowsCached() {
		return (BigInteger) getValue(24);
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached X$schemaTableStatisticsWithBufferRecord
	 */
	public X$schemaTableStatisticsWithBufferRecord() {
		super(X$schemaTableStatisticsWithBuffer.X$SCHEMA_TABLE_STATISTICS_WITH_BUFFER);
	}

	/**
	 * Create a detached, initialised X$schemaTableStatisticsWithBufferRecord
	 */
	public X$schemaTableStatisticsWithBufferRecord(String tableSchema, String tableName, ULong rowsFetched, ULong fetchLatency, ULong rowsInserted, ULong insertLatency, ULong rowsUpdated, ULong updateLatency, ULong rowsDeleted, ULong deleteLatency, BigInteger ioReadRequests, BigInteger ioRead, BigInteger ioReadLatency, BigInteger ioWriteRequests, BigInteger ioWrite, BigInteger ioWriteLatency, BigInteger ioMiscRequests, BigInteger ioMiscLatency, BigInteger innodbBufferAllocated, BigInteger innodbBufferData, BigInteger innodbBufferFree, Long innodbBufferPages, Long innodbBufferPagesHashed, Long innodbBufferPagesOld, BigInteger innodbBufferRowsCached) {
		super(X$schemaTableStatisticsWithBuffer.X$SCHEMA_TABLE_STATISTICS_WITH_BUFFER);

		setValue(0, tableSchema);
		setValue(1, tableName);
		setValue(2, rowsFetched);
		setValue(3, fetchLatency);
		setValue(4, rowsInserted);
		setValue(5, insertLatency);
		setValue(6, rowsUpdated);
		setValue(7, updateLatency);
		setValue(8, rowsDeleted);
		setValue(9, deleteLatency);
		setValue(10, ioReadRequests);
		setValue(11, ioRead);
		setValue(12, ioReadLatency);
		setValue(13, ioWriteRequests);
		setValue(14, ioWrite);
		setValue(15, ioWriteLatency);
		setValue(16, ioMiscRequests);
		setValue(17, ioMiscLatency);
		setValue(18, innodbBufferAllocated);
		setValue(19, innodbBufferData);
		setValue(20, innodbBufferFree);
		setValue(21, innodbBufferPages);
		setValue(22, innodbBufferPagesHashed);
		setValue(23, innodbBufferPagesOld);
		setValue(24, innodbBufferRowsCached);
	}
}
