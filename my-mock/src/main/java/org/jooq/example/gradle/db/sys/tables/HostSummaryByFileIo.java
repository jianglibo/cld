/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.sys.tables;


import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.example.gradle.db.sys.Sys;
import org.jooq.example.gradle.db.sys.tables.records.HostSummaryByFileIoRecord;
import org.jooq.impl.TableImpl;


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
public class HostSummaryByFileIo extends TableImpl<HostSummaryByFileIoRecord> {

	private static final long serialVersionUID = -1044287785;

	/**
	 * The reference instance of <code>sys.host_summary_by_file_io</code>
	 */
	public static final HostSummaryByFileIo HOST_SUMMARY_BY_FILE_IO = new HostSummaryByFileIo();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<HostSummaryByFileIoRecord> getRecordType() {
		return HostSummaryByFileIoRecord.class;
	}

	/**
	 * The column <code>sys.host_summary_by_file_io.host</code>.
	 */
	public final TableField<HostSummaryByFileIoRecord, String> HOST = createField("host", org.jooq.impl.SQLDataType.VARCHAR.length(60), this, "");

	/**
	 * The column <code>sys.host_summary_by_file_io.ios</code>.
	 */
	public final TableField<HostSummaryByFileIoRecord, BigInteger> IOS = createField("ios", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

	/**
	 * The column <code>sys.host_summary_by_file_io.io_latency</code>.
	 */
	public final TableField<HostSummaryByFileIoRecord, String> IO_LATENCY = createField("io_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * Create a <code>sys.host_summary_by_file_io</code> table reference
	 */
	public HostSummaryByFileIo() {
		this("host_summary_by_file_io", null);
	}

	/**
	 * Create an aliased <code>sys.host_summary_by_file_io</code> table reference
	 */
	public HostSummaryByFileIo(String alias) {
		this(alias, HOST_SUMMARY_BY_FILE_IO);
	}

	private HostSummaryByFileIo(String alias, Table<HostSummaryByFileIoRecord> aliased) {
		this(alias, aliased, null);
	}

	private HostSummaryByFileIo(String alias, Table<HostSummaryByFileIoRecord> aliased, Field<?>[] parameters) {
		super(alias, Sys.SYS, aliased, parameters, "VIEW");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public HostSummaryByFileIo as(String alias) {
		return new HostSummaryByFileIo(alias, this);
	}

	/**
	 * Rename this table
	 */
	public HostSummaryByFileIo rename(String name) {
		return new HostSummaryByFileIo(name, null);
	}
}