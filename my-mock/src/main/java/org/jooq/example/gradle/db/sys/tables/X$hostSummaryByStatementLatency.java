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
import org.jooq.example.gradle.db.sys.tables.records.X$hostSummaryByStatementLatencyRecord;
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
public class X$hostSummaryByStatementLatency extends TableImpl<X$hostSummaryByStatementLatencyRecord> {

	private static final long serialVersionUID = -1883348758;

	/**
	 * The reference instance of <code>sys.x$host_summary_by_statement_latency</code>
	 */
	public static final X$hostSummaryByStatementLatency X$HOST_SUMMARY_BY_STATEMENT_LATENCY = new X$hostSummaryByStatementLatency();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<X$hostSummaryByStatementLatencyRecord> getRecordType() {
		return X$hostSummaryByStatementLatencyRecord.class;
	}

	/**
	 * The column <code>sys.x$host_summary_by_statement_latency.host</code>.
	 */
	public final TableField<X$hostSummaryByStatementLatencyRecord, String> HOST = createField("host", org.jooq.impl.SQLDataType.VARCHAR.length(60), this, "");

	/**
	 * The column <code>sys.x$host_summary_by_statement_latency.total</code>.
	 */
	public final TableField<X$hostSummaryByStatementLatencyRecord, BigInteger> TOTAL = createField("total", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

	/**
	 * The column <code>sys.x$host_summary_by_statement_latency.total_latency</code>.
	 */
	public final TableField<X$hostSummaryByStatementLatencyRecord, BigInteger> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

	/**
	 * The column <code>sys.x$host_summary_by_statement_latency.max_latency</code>.
	 */
	public final TableField<X$hostSummaryByStatementLatencyRecord, BigInteger> MAX_LATENCY = createField("max_latency", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

	/**
	 * The column <code>sys.x$host_summary_by_statement_latency.lock_latency</code>.
	 */
	public final TableField<X$hostSummaryByStatementLatencyRecord, BigInteger> LOCK_LATENCY = createField("lock_latency", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

	/**
	 * The column <code>sys.x$host_summary_by_statement_latency.rows_sent</code>.
	 */
	public final TableField<X$hostSummaryByStatementLatencyRecord, BigInteger> ROWS_SENT = createField("rows_sent", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

	/**
	 * The column <code>sys.x$host_summary_by_statement_latency.rows_examined</code>.
	 */
	public final TableField<X$hostSummaryByStatementLatencyRecord, BigInteger> ROWS_EXAMINED = createField("rows_examined", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

	/**
	 * The column <code>sys.x$host_summary_by_statement_latency.rows_affected</code>.
	 */
	public final TableField<X$hostSummaryByStatementLatencyRecord, BigInteger> ROWS_AFFECTED = createField("rows_affected", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

	/**
	 * The column <code>sys.x$host_summary_by_statement_latency.full_scans</code>.
	 */
	public final TableField<X$hostSummaryByStatementLatencyRecord, BigInteger> FULL_SCANS = createField("full_scans", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(43), this, "");

	/**
	 * Create a <code>sys.x$host_summary_by_statement_latency</code> table reference
	 */
	public X$hostSummaryByStatementLatency() {
		this("x$host_summary_by_statement_latency", null);
	}

	/**
	 * Create an aliased <code>sys.x$host_summary_by_statement_latency</code> table reference
	 */
	public X$hostSummaryByStatementLatency(String alias) {
		this(alias, X$HOST_SUMMARY_BY_STATEMENT_LATENCY);
	}

	private X$hostSummaryByStatementLatency(String alias, Table<X$hostSummaryByStatementLatencyRecord> aliased) {
		this(alias, aliased, null);
	}

	private X$hostSummaryByStatementLatency(String alias, Table<X$hostSummaryByStatementLatencyRecord> aliased, Field<?>[] parameters) {
		super(alias, Sys.SYS, aliased, parameters, "VIEW");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$hostSummaryByStatementLatency as(String alias) {
		return new X$hostSummaryByStatementLatency(alias, this);
	}

	/**
	 * Rename this table
	 */
	public X$hostSummaryByStatementLatency rename(String name) {
		return new X$hostSummaryByStatementLatency(name, null);
	}
}