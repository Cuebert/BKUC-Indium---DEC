.class public Lgc/j;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field private final n:I

.field private final o:Ljava/lang/String;

.field private final transient p:Lgc/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgc/t<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lgc/t;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc/t<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lgc/j;->a(Lgc/t;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lgc/t;->b()I

    move-result v0

    iput v0, p0, Lgc/j;->n:I

    .line 3
    invoke-virtual {p1}, Lgc/t;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lgc/j;->o:Ljava/lang/String;

    .line 4
    iput-object p1, p0, Lgc/j;->p:Lgc/t;

    return-void
.end method

.method private static a(Lgc/t;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc/t<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "response == null"

    .line 1
    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HTTP "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lgc/t;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lgc/t;->g()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
