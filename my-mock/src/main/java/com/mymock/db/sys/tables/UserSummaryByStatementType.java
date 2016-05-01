/**
 * This class is generated by jOOQ
 */
package com.mymock.db.sys.tables;


import com.mymock.db.sys.Sys;
import com.mymock.db.sys.tables.records.UserSummaryByStatementTypeRecord;

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
public class UserSummaryByStatementType extends TableImpl<UserSummaryByStatementTypeRecord> {

	private static final long serialVersionUID = -2114522260;

	/**
	 * The reference instance of <code>sys.user_summary_by_statement_type</code>
	 */
	public static final UserSummaryByStatementType USER_SUMMARY_BY_STATEMENT_TYPE = new UserSummaryByStatementType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<UserSummaryByStatementTypeRecord> getRecordType() {
		return UserSummaryByStatementTypeRecord.class;
	}

	/**
	 * The column <code>sys.user_summary_by_statement_type.user</code>.
	 */
	public final TableField<UserSummaryByStatementTypeRecord, String> USER = createField("user", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

	/**
	 * The column <code>sys.user_summary_by_statement_type.statement</code>.
	 */
	public final TableField<UserSummaryByStatementTypeRecord, String> STATEMENT = createField("statement", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>sys.user_summary_by_statement_type.total</code>.
	 */
	public final TableField<UserSummaryByStatementTypeRecord, ULong> TOTAL = createField("total", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.user_summary_by_statement_type.total_latency</code>.
	 */
	public final TableField<UserSummaryByStatementTypeRecord, String> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>sys.user_summary_by_statement_type.max_latency</code>.
	 */
	public final TableField<UserSummaryByStatementTypeRecord, String> MAX_LATENCY = createField("max_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>sys.user_summary_by_statement_type.lock_latency</code>.
	 */
	public final TableField<UserSummaryByStatementTypeRecord, String> LOCK_LATENCY = createField("lock_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>sys.user_summary_by_statement_type.rows_sent</code>.
	 */
	public final TableField<UserSummaryByStatementTypeRecord, ULong> ROWS_SENT = createField("rows_sent", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.user_summary_by_statement_type.rows_examined</code>.
	 */
	public final TableField<UserSummaryByStatementTypeRecord, ULong> ROWS_EXAMINED = createField("rows_examined", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.user_summary_by_statement_type.rows_affected</code>.
	 */
	public final TableField<UserSummaryByStatementTypeRecord, ULong> ROWS_AFFECTED = createField("rows_affected", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>sys.user_summary_by_statement_type.full_scans</code>.
	 */
	public final TableField<UserSummaryByStatementTypeRecord, ULong> FULL_SCANS = createField("full_scans", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>sys.user_summary_by_statement_type</code> table reference
	 */
	public UserSummaryByStatementType() {
		this("user_summary_by_statement_type", null);
	}

	/**
	 * Create an aliased <code>sys.user_summary_by_statement_type</code> table reference
	 */
	public UserSummaryByStatementType(String alias) {
		this(alias, USER_SUMMARY_BY_STATEMENT_TYPE);
	}

	private UserSummaryByStatementType(String alias, Table<UserSummaryByStatementTypeRecord> aliased) {
		this(alias, aliased, null);
	}

	private UserSummaryByStatementType(String alias, Table<UserSummaryByStatementTypeRecord> aliased, Field<?>[] parameters) {
		super(alias, Sys.SYS, aliased, parameters, "VIEW");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserSummaryByStatementType as(String alias) {
		return new UserSummaryByStatementType(alias, this);
	}

	/**
	 * Rename this table
	 */
	public UserSummaryByStatementType rename(String name) {
		return new UserSummaryByStatementType(name, null);
	}
}
