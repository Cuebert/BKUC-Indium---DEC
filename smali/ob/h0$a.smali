.class Lob/h0$a;
.super Lob/h0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lob/h0;->c(Lob/b0;Lac/f;)Lob/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lob/b0;

.field final synthetic b:Lac/f;


# direct methods
.method constructor <init>(Lob/b0;Lac/f;)V
    .locals 0

    iput-object p1, p0, Lob/h0$a;->a:Lob/b0;

    iput-object p2, p0, Lob/h0$a;->b:Lac/f;

    invoke-direct {p0}, Lob/h0;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lob/h0$a;->b:Lac/f;

    invoke-virtual {v0}, Lac/f;->r()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public b()Lob/b0;
    .locals 1

    iget-object v0, p0, Lob/h0$a;->a:Lob/b0;

    return-object v0
.end method

.method public i(Lac/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lob/h0$a;->b:Lac/f;

    invoke-interface {p1, v0}, Lac/d;->E(Lac/f;)Lac/d;

    return-void
.end method
