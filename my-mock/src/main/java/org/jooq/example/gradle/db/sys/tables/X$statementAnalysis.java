/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.sys.tables;


import java.math.BigInteger;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.example.gradle.db.sys.Sys;
import org.jooq.example.gradle.db.sys.tables.records.X$statementAnalysisRecord;
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
public class X$statementAnalysis extends TableImpl<X$statementAnalysisRecord> {

	private static final long serialVersionUID = -866161215;

	/**
	 * The reference instance of <code>sys.x$statement_analysis</code>
	 */
	public static final X$statementAnalysis X$STATEMENT_ANALYSIS = new X$statementAnalysis();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<X$statementAnalysisRecord> getRecordType() {
		return X$statementAnalysisRecord.class;
	}

	/**
	 * The column <code>sys.x$statement_analysis.query</code>.
	 */
	public final TableField<X$statementAnalysisRecord, String> QUERY = createField("query", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>sys.x$statement_analysis.db</code>.
	 */
	public final TableField<X$statementAnalysisRecord, String> DB = createField("db", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>sys.x$statement_analysis.full_scan</code>.
	 */
	public final TableField<X$statementAnalysisRecord, String> FULL_SCAN = createField("full_scan", org.jooq.impl.SQLDataType.VARCHAR.length(1).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.x$statement_analysis.exec_count</code>.
	 */
	public final TableField<X$statementAnalysisRecord, ULong> EXEC_COUNT = createField("exec_count", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.x$statement_analysis.err_count</code>.
	 */
	public final TableField<X$statementAnalysisRecord, ULong> ERR_COUNT = createField("err_count", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.x$statement_analysis.warn_count</code>.
	 */
	public final TableField<X$statementAnalysisRecord, ULong> WARN_COUNT = createField("warn_count", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.x$statement_analysis.total_latency</code>.
	 */
	public final TableField<X$statementAnalysisRecord, ULong> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.x$statement_analysis.max_latency</code>.
	 */
	public final TableField<X$statementAnalysisRecord, ULong> MAX_LATENCY = createField("max_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.x$statement_analysis.avg_latency</code>.
	 */
	public final TableField<X$statementAnalysisRecord, ULong> AVG_LATENCY = createField("avg_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.x$statement_analysis.lock_latency</code>.
	 */
	public final TableField<X$statementAnalysisRecord, ULong> LOCK_LATENCY = createField("lock_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.x$statement_analysis.rows_sent</code>.
	 */
	public final TableField<X$statementAnalysisRecord, ULong> ROWS_SENT = createField("rows_sent", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.x$statement_analysis.rows_sent_avg</code>.
	 */
	public final TableField<X$statementAnalysisRecord, BigInteger> ROWS_SENT_AVG = createField("rows_sent_avg", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(21).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.x$statement_analysis.rows_examined</code>.
	 */
	public final TableField<X$statementAnalysisRecord, ULong> ROWS_EXAMINED = createField("rows_examined", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.x$statement_analysis.rows_examined_avg</code>.
	 */
	public final TableField<X$statementAnalysisRecord, BigInteger> ROWS_EXAMINED_AVG = createField("rows_examined_avg", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(21).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.x$statement_analysis.rows_affected</code>.
	 */
	public final TableField<X$statementAnalysisRecord, ULong> ROWS_AFFECTED = createField("rows_affected", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.x$statement_analysis.rows_affected_avg</code>.
	 */
	public final TableField<X$statementAnalysisRecord, BigInteger> ROWS_AFFECTED_AVG = createField("rows_affected_avg", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(21).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.x$statement_analysis.tmp_tables</code>.
	 */
	public final TableField<X$statementAnalysisRecord, ULong> TMP_TABLES = createField("tmp_tables", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.x$statement_analysis.tmp_disk_tables</code>.
	 */
	public final TableField<X$statementAnalysisRecord, ULong> TMP_DISK_TABLES = createField("tmp_disk_tables", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.x$statement_analysis.rows_sorted</code>.
	 */
	public final TableField<X$statementAnalysisRecord, ULong> ROWS_SORTED = createField("rows_sorted", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.x$statement_analysis.sort_merge_passes</code>.
	 */
	public final TableField<X$statementAnalysisRecord, ULong> SORT_MERGE_PASSES = createField("sort_merge_passes", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.x$statement_analysis.digest</code>.
	 */
	public final TableField<X$statementAnalysisRecord, String> DIGEST = createField("digest", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

	/**
	 * The column <code>sys.x$statement_analysis.first_seen</code>.
	 */
	public final TableField<X$statementAnalysisRecord, Timestamp> FIRST_SEEN = createField("first_seen", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.x$statement_analysis.last_seen</code>.
	 */
	public final TableField<X$statementAnalysisRecord, Timestamp> LAST_SEEN = createField("last_seen", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>sys.x$statement_analysis</code> table reference
	 */
	public X$statementAnalysis() {
		this("x$statement_analysis", null);
	}

	/**
	 * Create an aliased <code>sys.x$statement_analysis</code> table reference
	 */
	public X$statementAnalysis(String alias) {
		this(alias, X$STATEMENT_ANALYSIS);
	}

	private X$statementAnalysis(String alias, Table<X$statementAnalysisRecord> aliased) {
		this(alias, aliased, null);
	}

	private X$statementAnalysis(String alias, Table<X$statementAnalysisRecord> aliased, Field<?>[] parameters) {
		super(alias, Sys.SYS, aliased, parameters, "VIEW");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$statementAnalysis as(String alias) {
		return new X$statementAnalysis(alias, this);
	}

	/**
	 * Rename this table
	 */
	public X$statementAnalysis rename(String name) {
		return new X$statementAnalysis(name, null);
	}
}
