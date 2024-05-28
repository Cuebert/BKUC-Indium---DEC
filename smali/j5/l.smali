.class public final synthetic Lj5/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5/b;


# instance fields
.field public final synthetic a:Lj5/n;

.field public final synthetic b:Lj5/d;


# direct methods
.method public synthetic constructor <init>(Lj5/n;Lj5/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj5/l;->a:Lj5/n;

    iput-object p2, p0, Lj5/l;->b:Lj5/d;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lj5/l;->a:Lj5/n;

    iget-object v1, p0, Lj5/l;->b:Lj5/d;

    invoke-static {v0, v1}, Lj5/n;->e(Lj5/n;Lj5/d;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
