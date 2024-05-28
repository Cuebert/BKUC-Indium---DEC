.class final Lkb/b1$a;
.super Lkb/a1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkb/b1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final r:Lkb/b1;

.field private final s:Lkb/b1$b;

.field private final t:Lkb/m;

.field private final u:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkb/b1;Lkb/b1$b;Lkb/m;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkb/a1;-><init>()V

    .line 2
    iput-object p1, p0, Lkb/b1$a;->r:Lkb/b1;

    .line 3
    iput-object p2, p0, Lkb/b1$a;->s:Lkb/b1$b;

    .line 4
    iput-object p3, p0, Lkb/b1$a;->t:Lkb/m;

    .line 5
    iput-object p4, p0, Lkb/b1$a;->u:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lkb/b1$a;->s(Ljava/lang/Throwable;)V

    sget-object p1, Lta/l;->a:Lta/l;

    return-object p1
.end method

.method public s(Ljava/lang/Throwable;)V
    .locals 3

    iget-object p1, p0, Lkb/b1$a;->r:Lkb/b1;

    iget-object v0, p0, Lkb/b1$a;->s:Lkb/b1$b;

    iget-object v1, p0, Lkb/b1$a;->t:Lkb/m;

    iget-object v2, p0, Lkb/b1$a;->u:Ljava/lang/Object;

    invoke-static {p1, v0, v1, v2}, Lkb/b1;->h(Lkb/b1;Lkb/b1$b;Lkb/m;Ljava/lang/Object;)V

    return-void
.end method
