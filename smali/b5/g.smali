.class public final synthetic Lb5/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg4/k;


# instance fields
.field public final synthetic a:Lb5/h;

.field public final synthetic b:Lb5/c$a;


# direct methods
.method public synthetic constructor <init>(Lb5/h;Lb5/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/g;->a:Lb5/h;

    iput-object p2, p0, Lb5/g;->b:Lb5/c$a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lg4/l;
    .locals 2

    iget-object v0, p0, Lb5/g;->a:Lb5/h;

    iget-object v1, p0, Lb5/g;->b:Lb5/c$a;

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {v0, v1, p1}, Lb5/h;->b(Lb5/c$a;Ljava/lang/Long;)Lg4/l;

    move-result-object p1

    return-object p1
.end method
