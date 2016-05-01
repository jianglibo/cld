/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.sys.tables;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.example.gradle.db.sys.Sys;
import org.jooq.example.gradle.db.sys.tables.records.X$ioGlobalByFileByBytesRecord;
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
public class X$ioGlobalByFileByBytes extends TableImpl<X$ioGlobalByFileByBytesRecord> {

	private static final long serialVersionUID = -1852153304;

	/**
	 * The reference instance of <code>sys.x$io_global_by_file_by_bytes</code>
	 */
	public static final X$ioGlobalByFileByBytes X$IO_GLOBAL_BY_FILE_BY_BYTES = new X$ioGlobalByFileByBytes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<X$ioGlobalByFileByBytesRecord> getRecordType() {
		return X$ioGlobalByFileByBytesRecord.class;
	}

	/**
	 * The column <code>sys.x$io_global_by_file_by_bytes.file</code>.
	 */
	public final TableField<X$ioGlobalByFileByBytesRecord, String> FILE = createField("file", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false), this, "");

	/**
	 * The column <code>sys.x$io_global_by_file_by_bytes.count_read</code>.
	 */
	public final TableField<X$ioGlobalByFileByBytesRecord, ULong> COUNT_READ = createField("count_read", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.x$io_global_by_file_by_bytes.total_read</code>.
	 */
	public final TableField<X$ioGlobalByFileByBytesRecord, Long> TOTAL_READ = createField("total_read", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>sys.x$io_global_by_file_by_bytes.avg_read</code>.
	 */
	public final TableField<X$ioGlobalByFileByBytesRecord, BigDecimal> AVG_READ = createField("avg_read", org.jooq.impl.SQLDataType.DECIMAL.precision(23, 4).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.x$io_global_by_file_by_bytes.count_write</code>.
	 */
	public final TableField<X$ioGlobalByFileByBytesRecord, ULong> COUNT_WRITE = createField("count_write", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.x$io_global_by_file_by_bytes.total_written</code>.
	 */
	public final TableField<X$ioGlobalByFileByBytesRecord, Long> TOTAL_WRITTEN = createField("total_written", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>sys.x$io_global_by_file_by_bytes.avg_write</code>.
	 */
	public final TableField<X$ioGlobalByFileByBytesRecord, BigDecimal> AVG_WRITE = createField("avg_write", org.jooq.impl.SQLDataType.DECIMAL.precision(23, 4).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.x$io_global_by_file_by_bytes.total</code>.
	 */
	public final TableField<X$ioGlobalByFileByBytesRecord, Long> TOTAL = createField("total", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.x$io_global_by_file_by_bytes.write_pct</code>.
	 */
	public final TableField<X$ioGlobalByFileByBytesRecord, BigDecimal> WRITE_PCT = createField("write_pct", org.jooq.impl.SQLDataType.DECIMAL.precision(26, 2).nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>sys.x$io_global_by_file_by_bytes</code> table reference
	 */
	public X$ioGlobalByFileByBytes() {
		this("x$io_global_by_file_by_bytes", null);
	}

	/**
	 * Create an aliased <code>sys.x$io_global_by_file_by_bytes</code> table reference
	 */
	public X$ioGlobalByFileByBytes(String alias) {
		this(alias, X$IO_GLOBAL_BY_FILE_BY_BYTES);
	}

	private X$ioGlobalByFileByBytes(String alias, Table<X$ioGlobalByFileByBytesRecord> aliased) {
		this(alias, aliased, null);
	}

	private X$ioGlobalByFileByBytes(String alias, Table<X$ioGlobalByFileByBytesRecord> aliased, Field<?>[] parameters) {
		super(alias, Sys.SYS, aliased, parameters, "VIEW");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$ioGlobalByFileByBytes as(String alias) {
		return new X$ioGlobalByFileByBytes(alias, this);
	}

	/**
	 * Rename this table
	 */
	public X$ioGlobalByFileByBytes rename(String name) {
		return new X$ioGlobalByFileByBytes(name, null);
	}
}
