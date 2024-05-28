.class final Lb5/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lb5/l0;

.field private final b:Ld5/m;

.field private final c:Ld5/m;

.field private final d:Ld5/m;

.field private final e:Ld5/m;

.field private final f:Ld5/m;


# direct methods
.method synthetic constructor <init>(Landroid/content/Context;Lb5/k0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lb5/l0;->a:Lb5/l0;

    invoke-static {p1}, Ld5/k;->b(Ljava/lang/Object;)Ld5/j;

    move-result-object p1

    iput-object p1, p0, Lb5/l0;->b:Ld5/m;

    invoke-static {}, Lb5/j;->a()Lb5/k;

    move-result-object p2

    invoke-static {p2}, Ld5/i;->b(Ld5/m;)Ld5/m;

    move-result-object p2

    iput-object p2, p0, Lb5/l0;->c:Ld5/m;

    new-instance v0, Lb5/v;

    invoke-direct {v0, p1, p2}, Lb5/v;-><init>(Ld5/m;Ld5/m;)V

    invoke-static {v0}, Ld5/i;->b(Ld5/m;)Ld5/m;

    move-result-object p1

    iput-object p1, p0, Lb5/l0;->d:Ld5/m;

    new-instance p2, Lb5/y;

    invoke-direct {p2, p1}, Lb5/y;-><init>(Ld5/m;)V

    invoke-static {p2}, Ld5/i;->b(Ld5/m;)Ld5/m;

    move-result-object p2

    iput-object p2, p0, Lb5/l0;->e:Ld5/m;

    new-instance v0, Lb5/i;

    invoke-direct {v0, p1, p2}, Lb5/i;-><init>(Ld5/m;Ld5/m;)V

    invoke-static {v0}, Ld5/i;->b(Ld5/m;)Ld5/m;

    move-result-object p1

    iput-object p1, p0, Lb5/l0;->f:Ld5/m;

    return-void
.end method


# virtual methods
.method public final a()Lb5/c;
    .locals 1

    iget-object v0, p0, Lb5/l0;->f:Ld5/m;

    invoke-interface {v0}, Ld5/m;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb5/c;

    return-object v0
.end method
