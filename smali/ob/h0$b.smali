.class Lob/h0$b;
.super Lob/h0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lob/h0;->f(Lob/b0;[BII)Lob/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lob/b0;

.field final synthetic b:I

.field final synthetic c:[B

.field final synthetic d:I


# direct methods
.method constructor <init>(Lob/b0;I[BI)V
    .locals 0

    iput-object p1, p0, Lob/h0$b;->a:Lob/b0;

    iput p2, p0, Lob/h0$b;->b:I

    iput-object p3, p0, Lob/h0$b;->c:[B

    iput p4, p0, Lob/h0$b;->d:I

    invoke-direct {p0}, Lob/h0;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget v0, p0, Lob/h0$b;->b:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public b()Lob/b0;
    .locals 1

    iget-object v0, p0, Lob/h0$b;->a:Lob/b0;

    return-object v0
.end method

.method public i(Lac/d;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lob/h0$b;->c:[B

    iget v1, p0, Lob/h0$b;->d:I

    iget v2, p0, Lob/h0$b;->b:I

    invoke-interface {p1, v0, v1, v2}, Lac/d;->h([BII)Lac/d;

    return-void
.end method
