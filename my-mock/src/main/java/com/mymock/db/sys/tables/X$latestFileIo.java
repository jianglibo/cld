/**
 * This class is generated by jOOQ
 */
package com.mymock.db.sys.tables;


import com.mymock.db.sys.Sys;
import com.mymock.db.sys.tables.records.X$latestFileIoRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
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
public class X$latestFileIo extends TableImpl<X$latestFileIoRecord> {

	private static final long serialVersionUID = 210365770;

	/**
	 * The reference instance of <code>sys.x$latest_file_io</code>
	 */
	public static final X$latestFileIo X$LATEST_FILE_IO = new X$latestFileIo();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<X$latestFileIoRecord> getRecordType() {
		return X$latestFileIoRecord.class;
	}

	/**
	 * The column <code>sys.x$latest_file_io.thread</code>.
	 */
	public final TableField<X$latestFileIoRecord, String> THREAD = createField("thread", org.jooq.impl.SQLDataType.VARCHAR.length(149), this, "");

	/**
	 * The column <code>sys.x$latest_file_io.file</code>.
	 */
	public final TableField<X$latestFileIoRecord, String> FILE = createField("file", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

	/**
	 * The column <code>sys.x$latest_file_io.latency</code>.
	 */
	public final TableField<X$latestFileIoRecord, ULong> LATENCY = createField("latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

	/**
	 * The column <code>sys.x$latest_file_io.operation</code>.
	 */
	public final TableField<X$latestFileIoRecord, String> OPERATION = createField("operation", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

	/**
	 * The column <code>sys.x$latest_file_io.requested</code>.
	 */
	public final TableField<X$latestFileIoRecord, Long> REQUESTED = createField("requested", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>sys.x$latest_file_io</code> table reference
	 */
	public X$latestFileIo() {
		this("x$latest_file_io", null);
	}

	/**
	 * Create an aliased <code>sys.x$latest_file_io</code> table reference
	 */
	public X$latestFileIo(String alias) {
		this(alias, X$LATEST_FILE_IO);
	}

	private X$latestFileIo(String alias, Table<X$latestFileIoRecord> aliased) {
		this(alias, aliased, null);
	}

	private X$latestFileIo(String alias, Table<X$latestFileIoRecord> aliased, Field<?>[] parameters) {
		super(alias, Sys.SYS, aliased, parameters, "VIEW");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$latestFileIo as(String alias) {
		return new X$latestFileIo(alias, this);
	}

	/**
	 * Rename this table
	 */
	public X$latestFileIo rename(String name) {
		return new X$latestFileIo(name, null);
	}
}
