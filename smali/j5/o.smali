.class public final synthetic Lj5/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5/b;


# instance fields
.field public final synthetic a:Lj5/i;


# direct methods
.method public synthetic constructor <init>(Lj5/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj5/o;->a:Lj5/i;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj5/o;->a:Lj5/i;

    invoke-static {v0}, Lj5/n$b;->a(Lj5/i;)Lj5/i;

    move-result-object v0

    return-object v0
.end method
