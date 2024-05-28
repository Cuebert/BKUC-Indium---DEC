.class public final synthetic Lh2/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj2/b$a;


# instance fields
.field public final synthetic a:Lh2/r;

.field public final synthetic b:Ljava/lang/Iterable;


# direct methods
.method public synthetic constructor <init>(Lh2/r;Ljava/lang/Iterable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/m;->a:Lh2/r;

    iput-object p2, p0, Lh2/m;->b:Ljava/lang/Iterable;

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lh2/m;->a:Lh2/r;

    iget-object v1, p0, Lh2/m;->b:Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lh2/r;->g(Lh2/r;Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
