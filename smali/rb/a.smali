.class public final Lrb/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lob/a0;


# instance fields
.field public final a:Lob/d0;


# direct methods
.method public constructor <init>(Lob/d0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lrb/a;->a:Lob/d0;

    return-void
.end method


# virtual methods
.method public a(Lob/a0$a;)Lob/i0;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object v0, p1

    check-cast v0, Lsb/g;

    .line 2
    invoke-virtual {v0}, Lsb/g;->e()Lob/g0;

    move-result-object v1

    .line 3
    invoke-virtual {v0}, Lsb/g;->i()Lrb/k;

    move-result-object v2

    .line 4
    invoke-virtual {v1}, Lob/g0;->g()Ljava/lang/String;

    move-result-object v3

    const-string v4, "GET"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    .line 5
    invoke-virtual {v2, p1, v3}, Lrb/k;->k(Lob/a0$a;Z)Lrb/c;

    move-result-object p1

    .line 6
    invoke-virtual {v0, v1, v2, p1}, Lsb/g;->h(Lob/g0;Lrb/k;Lrb/c;)Lob/i0;

    move-result-object p1

    return-object p1
.end method
