.class final Lz2/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/h$a;


# instance fields
.field final synthetic a:Lx2/h;

.field final synthetic b:Lg4/m;

.field final synthetic c:Lz2/i$a;

.field final synthetic d:Lz2/d0;


# direct methods
.method constructor <init>(Lx2/h;Lg4/m;Lz2/i$a;Lz2/d0;)V
    .locals 0

    iput-object p1, p0, Lz2/a0;->a:Lx2/h;

    iput-object p2, p0, Lz2/a0;->b:Lg4/m;

    iput-object p3, p0, Lz2/a0;->c:Lz2/i$a;

    iput-object p4, p0, Lz2/a0;->d:Lz2/d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lz2/a0;->a:Lx2/h;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x0

    .line 2
    invoke-virtual {p1, v1, v2, v0}, Lx2/h;->c(JLjava/util/concurrent/TimeUnit;)Lx2/m;

    move-result-object p1

    iget-object v0, p0, Lz2/a0;->b:Lg4/m;

    iget-object v1, p0, Lz2/a0;->c:Lz2/i$a;

    .line 3
    invoke-interface {v1, p1}, Lz2/i$a;->a(Lx2/m;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lg4/m;->c(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lz2/a0;->b:Lg4/m;

    .line 4
    invoke-static {p1}, Lz2/a;->a(Lcom/google/android/gms/common/api/Status;)Lx2/b;

    move-result-object p1

    .line 5
    invoke-virtual {v0, p1}, Lg4/m;->b(Ljava/lang/Exception;)V

    return-void
.end method
