.class Lob/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqb/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lob/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lob/e;


# direct methods
.method constructor <init>(Lob/e;)V
    .locals 0

    iput-object p1, p0, Lob/e$a;->a:Lob/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lob/e$a;->a:Lob/e;

    invoke-virtual {v0}, Lob/e;->O()V

    return-void
.end method

.method public b(Lob/g0;)Lob/i0;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lob/e$a;->a:Lob/e;

    invoke-virtual {v0, p1}, Lob/e;->c(Lob/g0;)Lob/i0;

    move-result-object p1

    return-object p1
.end method

.method public c(Lob/i0;Lob/i0;)V
    .locals 1

    iget-object v0, p0, Lob/e$a;->a:Lob/e;

    invoke-virtual {v0, p1, p2}, Lob/e;->T(Lob/i0;Lob/i0;)V

    return-void
.end method

.method public d(Lqb/c;)V
    .locals 1

    iget-object v0, p0, Lob/e$a;->a:Lob/e;

    invoke-virtual {v0, p1}, Lob/e;->Q(Lqb/c;)V

    return-void
.end method

.method public e(Lob/g0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lob/e$a;->a:Lob/e;

    invoke-virtual {v0, p1}, Lob/e;->z(Lob/g0;)V

    return-void
.end method

.method public f(Lob/i0;)Lqb/b;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lob/e$a;->a:Lob/e;

    invoke-virtual {v0, p1}, Lob/e;->i(Lob/i0;)Lqb/b;

    move-result-object p1

    return-object p1
.end method
