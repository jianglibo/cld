/**
 * This class is generated by jOOQ
 */
package com.mymock.db.information_schema.tables;


import com.mymock.db.information_schema.InformationSchema;
import com.mymock.db.information_schema.tables.records.InnodbFtIndexCacheRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
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
public class InnodbFtIndexCache extends TableImpl<InnodbFtIndexCacheRecord> {

	private static final long serialVersionUID = -577265642;

	/**
	 * The reference instance of <code>information_schema.INNODB_FT_INDEX_CACHE</code>
	 */
	public static final InnodbFtIndexCache INNODB_FT_INDEX_CACHE = new InnodbFtIndexCache();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<InnodbFtIndexCacheRecord> getRecordType() {
		return InnodbFtIndexCacheRecord.class;
	}

	/**
	 * The column <code>information_schema.INNODB_FT_INDEX_CACHE.WORD</code>.
	 */
	public final TableField<InnodbFtIndexCacheRecord, String> WORD = createField("WORD", org.jooq.impl.SQLDataType.VARCHAR.length(337).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_FT_INDEX_CACHE.FIRST_DOC_ID</code>.
	 */
	public final TableField<InnodbFtIndexCacheRecord, ULong> FIRST_DOC_ID = createField("FIRST_DOC_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_FT_INDEX_CACHE.LAST_DOC_ID</code>.
	 */
	public final TableField<InnodbFtIndexCacheRecord, ULong> LAST_DOC_ID = createField("LAST_DOC_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_FT_INDEX_CACHE.DOC_COUNT</code>.
	 */
	public final TableField<InnodbFtIndexCacheRecord, ULong> DOC_COUNT = createField("DOC_COUNT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_FT_INDEX_CACHE.DOC_ID</code>.
	 */
	public final TableField<InnodbFtIndexCacheRecord, ULong> DOC_ID = createField("DOC_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_FT_INDEX_CACHE.POSITION</code>.
	 */
	public final TableField<InnodbFtIndexCacheRecord, ULong> POSITION = createField("POSITION", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.INNODB_FT_INDEX_CACHE</code> table reference
	 */
	public InnodbFtIndexCache() {
		this("INNODB_FT_INDEX_CACHE", null);
	}

	/**
	 * Create an aliased <code>information_schema.INNODB_FT_INDEX_CACHE</code> table reference
	 */
	public InnodbFtIndexCache(String alias) {
		this(alias, INNODB_FT_INDEX_CACHE);
	}

	private InnodbFtIndexCache(String alias, Table<InnodbFtIndexCacheRecord> aliased) {
		this(alias, aliased, null);
	}

	private InnodbFtIndexCache(String alias, Table<InnodbFtIndexCacheRecord> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbFtIndexCache as(String alias) {
		return new InnodbFtIndexCache(alias, this);
	}

	/**
	 * Rename this table
	 */
	public InnodbFtIndexCache rename(String name) {
		return new InnodbFtIndexCache(name, null);
	}
}
