/**
 * This class is generated by jOOQ
 */
package com.mymock.db.sys.tables;


import com.mymock.db.sys.Sys;
import com.mymock.db.sys.tables.records.StatementsWithFullTableScansRecord;

import java.math.BigInteger;
import java.sql.Timestamp;

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
public class StatementsWithFullTableScans extends TableImpl<StatementsWithFullTableScansRecord> {

	private static final long serialVersionUID = 1069940251;

	/**
	 * The reference instance of <code>sys.statements_with_full_table_scans</code>
	 */
	public static final StatementsWithFullTableScans STATEMENTS_WITH_FULL_TABLE_SCANS = new StatementsWithFullTableScans();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<StatementsWithFullTableScansRecord> getRecordType() {
		return StatementsWithFullTableScansRecord.class;
	}

	/**
	 * The column <code>sys.statements_with_full_table_scans.query</code>.
	 */
	public final TableField<StatementsWithFullTableScansRecord, String> QUERY = createField("query", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>sys.statements_with_full_table_scans.db</code>.
	 */
	public final TableField<StatementsWithFullTableScansRecord, String> DB = createField("db", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>sys.statements_with_full_table_scans.exec_count</code>.
	 */
	public final TableField<StatementsWithFullTableScansRecord, ULong> EXEC_COUNT = createField("exec_count", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.statements_with_full_table_scans.total_latency</code>.
	 */
	public final TableField<StatementsWithFullTableScansRecord, String> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>sys.statements_with_full_table_scans.no_index_used_count</code>.
	 */
	public final TableField<StatementsWithFullTableScansRecord, ULong> NO_INDEX_USED_COUNT = createField("no_index_used_count", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.statements_with_full_table_scans.no_good_index_used_count</code>.
	 */
	public final TableField<StatementsWithFullTableScansRecord, ULong> NO_GOOD_INDEX_USED_COUNT = createField("no_good_index_used_count", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.statements_with_full_table_scans.no_index_used_pct</code>.
	 */
	public final TableField<StatementsWithFullTableScansRecord, BigInteger> NO_INDEX_USED_PCT = createField("no_index_used_pct", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(24).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.statements_with_full_table_scans.rows_sent</code>.
	 */
	public final TableField<StatementsWithFullTableScansRecord, ULong> ROWS_SENT = createField("rows_sent", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.statements_with_full_table_scans.rows_examined</code>.
	 */
	public final TableField<StatementsWithFullTableScansRecord, ULong> ROWS_EXAMINED = createField("rows_examined", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.statements_with_full_table_scans.rows_sent_avg</code>.
	 */
	public final TableField<StatementsWithFullTableScansRecord, BigInteger> ROWS_SENT_AVG = createField("rows_sent_avg", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(21), this, "");

	/**
	 * The column <code>sys.statements_with_full_table_scans.rows_examined_avg</code>.
	 */
	public final TableField<StatementsWithFullTableScansRecord, BigInteger> ROWS_EXAMINED_AVG = createField("rows_examined_avg", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(21), this, "");

	/**
	 * The column <code>sys.statements_with_full_table_scans.first_seen</code>.
	 */
	public final TableField<StatementsWithFullTableScansRecord, Timestamp> FIRST_SEEN = createField("first_seen", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.statements_with_full_table_scans.last_seen</code>.
	 */
	public final TableField<StatementsWithFullTableScansRecord, Timestamp> LAST_SEEN = createField("last_seen", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>sys.statements_with_full_table_scans.digest</code>.
	 */
	public final TableField<StatementsWithFullTableScansRecord, String> DIGEST = createField("digest", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

	/**
	 * Create a <code>sys.statements_with_full_table_scans</code> table reference
	 */
	public StatementsWithFullTableScans() {
		this("statements_with_full_table_scans", null);
	}

	/**
	 * Create an aliased <code>sys.statements_with_full_table_scans</code> table reference
	 */
	public StatementsWithFullTableScans(String alias) {
		this(alias, STATEMENTS_WITH_FULL_TABLE_SCANS);
	}

	private StatementsWithFullTableScans(String alias, Table<StatementsWithFullTableScansRecord> aliased) {
		this(alias, aliased, null);
	}

	private StatementsWithFullTableScans(String alias, Table<StatementsWithFullTableScansRecord> aliased, Field<?>[] parameters) {
		super(alias, Sys.SYS, aliased, parameters, "VIEW");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatementsWithFullTableScans as(String alias) {
		return new StatementsWithFullTableScans(alias, this);
	}

	/**
	 * Rename this table
	 */
	public StatementsWithFullTableScans rename(String name) {
		return new StatementsWithFullTableScans(name, null);
	}
}
