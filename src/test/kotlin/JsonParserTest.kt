package net.taobits.screamingjson

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class JsonParserTest : ShouldSpec ({
    context("parsing an int") {
        JsonParser("1").parseInt() shouldBe 1
    }
})