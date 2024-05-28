.class public Lqa/j$b;
.super Ljava/io/IOException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqa/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field final n:Z

.field final o:I


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-static {p2}, Lqa/q;->b(I)Z

    move-result p1

    iput-boolean p1, p0, Lqa/j$b;->n:Z

    .line 3
    iput p3, p0, Lqa/j$b;->o:I

    return-void
.end method
