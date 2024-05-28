.class Lgc/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lob/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgc/n;->W(Lgc/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lgc/d;

.field final synthetic b:Lgc/n;


# direct methods
.method constructor <init>(Lgc/n;Lgc/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lgc/n$a;->b:Lgc/n;

    iput-object p2, p0, Lgc/n$a;->a:Lgc/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private c(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lgc/n$a;->a:Lgc/d;

    iget-object v1, p0, Lgc/n$a;->b:Lgc/n;

    invoke-interface {v0, v1, p1}, Lgc/d;->b(Lgc/b;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 2
    invoke-static {p1}, Lgc/y;->s(Ljava/lang/Throwable;)V

    .line 3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lob/g;Lob/i0;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object p1, p0, Lgc/n$a;->b:Lgc/n;

    invoke-virtual {p1, p2}, Lgc/n;->g(Lob/i0;)Lgc/t;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 2
    :try_start_1
    iget-object p2, p0, Lgc/n$a;->a:Lgc/d;

    iget-object v0, p0, Lgc/n$a;->b:Lgc/n;

    invoke-interface {p2, v0, p1}, Lgc/d;->a(Lgc/b;Lgc/t;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 3
    invoke-static {p1}, Lgc/y;->s(Ljava/lang/Throwable;)V

    .line 4
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void

    :catchall_1
    move-exception p1

    .line 5
    invoke-static {p1}, Lgc/y;->s(Ljava/lang/Throwable;)V

    .line 6
    invoke-direct {p0, p1}, Lgc/n$a;->c(Ljava/lang/Throwable;)V

    return-void
.end method

.method public b(Lob/g;Ljava/io/IOException;)V
    .locals 0

    invoke-direct {p0, p2}, Lgc/n$a;->c(Ljava/lang/Throwable;)V

    return-void
.end method
