.class abstract Lgc/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgc/p$q;,
        Lgc/p$c;,
        Lgc/p$j;,
        Lgc/p$o;,
        Lgc/p$i;,
        Lgc/p$e;,
        Lgc/p$d;,
        Lgc/p$h;,
        Lgc/p$g;,
        Lgc/p$m;,
        Lgc/p$n;,
        Lgc/p$l;,
        Lgc/p$k;,
        Lgc/p$f;,
        Lgc/p$p;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method abstract a(Lgc/r;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc/r;",
            "TT;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method final b()Lgc/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lgc/p<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Lgc/p$b;

    invoke-direct {v0, p0}, Lgc/p$b;-><init>(Lgc/p;)V

    return-object v0
.end method

.method final c()Lgc/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lgc/p<",
            "Ljava/lang/Iterable<",
            "TT;>;>;"
        }
    .end annotation

    new-instance v0, Lgc/p$a;

    invoke-direct {v0, p0}, Lgc/p$a;-><init>(Lgc/p;)V

    return-object v0
.end method
