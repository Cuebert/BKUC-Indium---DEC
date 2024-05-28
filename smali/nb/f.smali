.class public Lnb/f;
.super Lkb/o0;
.source "SourceFile"


# instance fields
.field private final q:I

.field private final r:I

.field private final s:J

.field private final t:Ljava/lang/String;

.field private u:Lnb/a;


# direct methods
.method public constructor <init>(IIJLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkb/o0;-><init>()V

    .line 2
    iput p1, p0, Lnb/f;->q:I

    .line 3
    iput p2, p0, Lnb/f;->r:I

    .line 4
    iput-wide p3, p0, Lnb/f;->s:J

    .line 5
    iput-object p5, p0, Lnb/f;->t:Ljava/lang/String;

    .line 6
    invoke-direct {p0}, Lnb/f;->m0()Lnb/a;

    move-result-object p1

    iput-object p1, p0, Lnb/f;->u:Lnb/a;

    return-void
.end method

.method private final m0()Lnb/a;
    .locals 7

    new-instance v6, Lnb/a;

    iget v1, p0, Lnb/f;->q:I

    iget v2, p0, Lnb/f;->r:I

    iget-wide v3, p0, Lnb/f;->s:J

    iget-object v5, p0, Lnb/f;->t:Ljava/lang/String;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lnb/a;-><init>(IIJLjava/lang/String;)V

    return-object v6
.end method


# virtual methods
.method public j0(Lva/e;Ljava/lang/Runnable;)V
    .locals 6

    iget-object v0, p0, Lnb/f;->u:Lnb/a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v1, p2

    invoke-static/range {v0 .. v5}, Lnb/a;->O(Lnb/a;Ljava/lang/Runnable;Lnb/i;ZILjava/lang/Object;)V

    return-void
.end method

.method public final n0(Ljava/lang/Runnable;Lnb/i;Z)V
    .locals 1

    iget-object v0, p0, Lnb/f;->u:Lnb/a;

    invoke-virtual {v0, p1, p2, p3}, Lnb/a;->z(Ljava/lang/Runnable;Lnb/i;Z)V

    return-void
.end method
