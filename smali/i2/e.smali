.class abstract Li2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li2/e$a;
    }
.end annotation


# static fields
.field static final a:Li2/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Li2/e;->a()Li2/e$a;

    move-result-object v0

    const-wide/32 v1, 0xa00000

    .line 2
    invoke-virtual {v0, v1, v2}, Li2/e$a;->f(J)Li2/e$a;

    move-result-object v0

    const/16 v1, 0xc8

    .line 3
    invoke-virtual {v0, v1}, Li2/e$a;->d(I)Li2/e$a;

    move-result-object v0

    const/16 v1, 0x2710

    .line 4
    invoke-virtual {v0, v1}, Li2/e$a;->b(I)Li2/e$a;

    move-result-object v0

    const-wide/32 v1, 0x240c8400

    .line 5
    invoke-virtual {v0, v1, v2}, Li2/e$a;->c(J)Li2/e$a;

    move-result-object v0

    const v1, 0x14000

    .line 6
    invoke-virtual {v0, v1}, Li2/e$a;->e(I)Li2/e$a;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Li2/e$a;->a()Li2/e;

    move-result-object v0

    sput-object v0, Li2/e;->a:Li2/e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a()Li2/e$a;
    .locals 1

    new-instance v0, Li2/a$b;

    invoke-direct {v0}, Li2/a$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method abstract b()I
.end method

.method abstract c()J
.end method

.method abstract d()I
.end method

.method abstract e()I
.end method

.method abstract f()J
.end method
