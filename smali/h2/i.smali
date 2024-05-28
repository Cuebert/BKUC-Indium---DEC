.class public final synthetic Lh2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj2/b$a;


# instance fields
.field public final synthetic a:Lh2/r;

.field public final synthetic b:La2/o;


# direct methods
.method public synthetic constructor <init>(Lh2/r;La2/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/i;->a:Lh2/r;

    iput-object p2, p0, Lh2/i;->b:La2/o;

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lh2/i;->a:Lh2/r;

    iget-object v1, p0, Lh2/i;->b:La2/o;

    invoke-static {v0, v1}, Lh2/r;->b(Lh2/r;La2/o;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
