package com.github.arganaphang.wolletz.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.github.arganaphang.wolletz.entity.Transaction
import com.github.arganaphang.wolletz.entity.TransactionType
import kotlinx.datetime.format
import kotlinx.datetime.format.DateTimeComponents
import kotlinx.datetime.format.FormatStringsInDatetimeFormats
import kotlinx.datetime.format.byUnicodePattern

@OptIn(FormatStringsInDatetimeFormats::class)
@Composable
fun TransactionCard(
    transaction: Transaction
) {
    val colorIn = Color(0xFFFFDCDD)
    val colorOut = Color(0xFFDDFFDC)
    Row(
        modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(12.dp))
            .background(MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.3f))
            .padding(horizontal = 16.dp, vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier.size(32.dp).clip(RoundedCornerShape(12.dp))
                .background(if (transaction.type == TransactionType.IN) colorIn else colorOut)
                .padding(horizontal = 16.dp, vertical = 12.dp)
        ) {}
        Spacer(modifier = Modifier.width(16.dp))
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(transaction.name)
            Spacer(modifier = Modifier.height(4.dp))
            Text(transaction.createdAt.format(DateTimeComponents.Format {
                byUnicodePattern("uuuu-MM-dd") // TODO: Change format
            }))
        }
        Spacer(modifier = Modifier.width(16.dp))
        Text("${if (transaction.type == TransactionType.IN) "+" else "-"}${transaction.amount}")
    }
}
