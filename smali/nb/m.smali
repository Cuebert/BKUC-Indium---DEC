.class final Lnb/m;
.super Lkb/v;
.source "SourceFile"


# static fields
.field public static final p:Lnb/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnb/m;

    invoke-direct {v0}, Lnb/m;-><init>()V

    sput-object v0, Lnb/m;->p:Lnb/m;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkb/v;-><init>()V

    return-void
.end method


# virtual methods
.method public j0(Lva/e;Ljava/lang/Runnable;)V
    .locals 2

    sget-object p1, Lnb/c;->v:Lnb/c;

    sget-object v0, Lnb/l;->h:Lnb/i;

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1}, Lnb/f;->n0(Ljava/lang/Runnable;Lnb/i;Z)V

    return-void
.end method

.method public l0(I)Lkb/v;
    .locals 1

    .line 1
    invoke-static {p1}, Lmb/l;->a(I)V

    .line 2
    sget v0, Lnb/l;->d:I

    if-lt p1, v0, :cond_0

    return-object p0

    .line 3
    :cond_0
    invoke-super {p0, p1}, Lkb/v;->l0(I)Lkb/v;

    move-result-object p1

    return-object p1
.end method
