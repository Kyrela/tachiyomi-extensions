package eu.kanade.tachiyomi.multisrc.grouple

import generator.ThemeSourceData.SingleLang
import generator.ThemeSourceGenerator

class GroupLeGenerator : ThemeSourceGenerator {

    override val themePkg = "grouple"

    override val themeClass = "GroupLe"

    override val baseVersionCode = 17

    override val sources = listOf(
        SingleLang("ReadManga", "https://readmanga.live", "ru", overrideVersionCode = 46),
        SingleLang("MintManga", "https://mintmanga.live", "ru", overrideVersionCode = 46),
        SingleLang("AllHentai", "https://2023.allhen.online", "ru", isNsfw = true, overrideVersionCode = 22),
        SingleLang("SelfManga", "https://selfmanga.live", "ru", overrideVersionCode = 22),
        SingleLang("RuMIX", "https://rumix.me", "ru", overrideVersionCode = 1),
    )

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            GroupLeGenerator().createAll()
        }
    }
}
