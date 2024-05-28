.class public final synthetic Laa/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg4/h;


# instance fields
.field public final synthetic a:Laa/f;


# direct methods
.method public synthetic constructor <init>(Laa/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laa/e;->a:Laa/f;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Laa/e;->a:Laa/f;

    check-cast p1, Lb5/c$c;

    invoke-static {v0, p1}, Laa/f;->a(Laa/f;Lb5/c$c;)V

    return-void
.end method
