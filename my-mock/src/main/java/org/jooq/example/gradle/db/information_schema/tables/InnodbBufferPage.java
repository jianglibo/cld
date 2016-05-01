/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.information_schema.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.example.gradle.db.information_schema.InformationSchema;
import org.jooq.example.gradle.db.information_schema.tables.records.InnodbBufferPageRecord;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbBufferPage extends TableImpl<InnodbBufferPageRecord> {

	private static final long serialVersionUID = -1171476910;

	/**
	 * The reference instance of <code>information_schema.INNODB_BUFFER_PAGE</code>
	 */
	public static final InnodbBufferPage INNODB_BUFFER_PAGE = new InnodbBufferPage();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<InnodbBufferPageRecord> getRecordType() {
		return InnodbBufferPageRecord.class;
	}

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE.POOL_ID</code>.
	 */
	public final TableField<InnodbBufferPageRecord, ULong> POOL_ID = createField("POOL_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE.BLOCK_ID</code>.
	 */
	public final TableField<InnodbBufferPageRecord, ULong> BLOCK_ID = createField("BLOCK_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE.SPACE</code>.
	 */
	public final TableField<InnodbBufferPageRecord, ULong> SPACE = createField("SPACE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE.PAGE_NUMBER</code>.
	 */
	public final TableField<InnodbBufferPageRecord, ULong> PAGE_NUMBER = createField("PAGE_NUMBER", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE.PAGE_TYPE</code>.
	 */
	public final TableField<InnodbBufferPageRecord, String> PAGE_TYPE = createField("PAGE_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE.FLUSH_TYPE</code>.
	 */
	public final TableField<InnodbBufferPageRecord, ULong> FLUSH_TYPE = createField("FLUSH_TYPE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE.FIX_COUNT</code>.
	 */
	public final TableField<InnodbBufferPageRecord, ULong> FIX_COUNT = createField("FIX_COUNT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE.IS_HASHED</code>.
	 */
	public final TableField<InnodbBufferPageRecord, String> IS_HASHED = createField("IS_HASHED", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE.NEWEST_MODIFICATION</code>.
	 */
	public final TableField<InnodbBufferPageRecord, ULong> NEWEST_MODIFICATION = createField("NEWEST_MODIFICATION", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE.OLDEST_MODIFICATION</code>.
	 */
	public final TableField<InnodbBufferPageRecord, ULong> OLDEST_MODIFICATION = createField("OLDEST_MODIFICATION", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE.ACCESS_TIME</code>.
	 */
	public final TableField<InnodbBufferPageRecord, ULong> ACCESS_TIME = createField("ACCESS_TIME", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE.TABLE_NAME</code>.
	 */
	public final TableField<InnodbBufferPageRecord, String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE.INDEX_NAME</code>.
	 */
	public final TableField<InnodbBufferPageRecord, String> INDEX_NAME = createField("INDEX_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE.NUMBER_RECORDS</code>.
	 */
	public final TableField<InnodbBufferPageRecord, ULong> NUMBER_RECORDS = createField("NUMBER_RECORDS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE.DATA_SIZE</code>.
	 */
	public final TableField<InnodbBufferPageRecord, ULong> DATA_SIZE = createField("DATA_SIZE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE.COMPRESSED_SIZE</code>.
	 */
	public final TableField<InnodbBufferPageRecord, ULong> COMPRESSED_SIZE = createField("COMPRESSED_SIZE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE.PAGE_STATE</code>.
	 */
	public final TableField<InnodbBufferPageRecord, String> PAGE_STATE = createField("PAGE_STATE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE.IO_FIX</code>.
	 */
	public final TableField<InnodbBufferPageRecord, String> IO_FIX = createField("IO_FIX", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE.IS_OLD</code>.
	 */
	public final TableField<InnodbBufferPageRecord, String> IS_OLD = createField("IS_OLD", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

	/**
	 * The column <code>information_schema.INNODB_BUFFER_PAGE.FREE_PAGE_CLOCK</code>.
	 */
	public final TableField<InnodbBufferPageRecord, ULong> FREE_PAGE_CLOCK = createField("FREE_PAGE_CLOCK", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.INNODB_BUFFER_PAGE</code> table reference
	 */
	public InnodbBufferPage() {
		this("INNODB_BUFFER_PAGE", null);
	}

	/**
	 * Create an aliased <code>information_schema.INNODB_BUFFER_PAGE</code> table reference
	 */
	public InnodbBufferPage(String alias) {
		this(alias, INNODB_BUFFER_PAGE);
	}

	private InnodbBufferPage(String alias, Table<InnodbBufferPageRecord> aliased) {
		this(alias, aliased, null);
	}

	private InnodbBufferPage(String alias, Table<InnodbBufferPageRecord> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPage as(String alias) {
		return new InnodbBufferPage(alias, this);
	}

	/**
	 * Rename this table
	 */
	public InnodbBufferPage rename(String name) {
		return new InnodbBufferPage(name, null);
	}
}
