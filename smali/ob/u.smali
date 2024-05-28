.class public final synthetic Lob/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lob/v$b;


# instance fields
.field public final synthetic a:Lob/v;


# direct methods
.method public synthetic constructor <init>(Lob/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lob/u;->a:Lob/v;

    return-void
.end method


# virtual methods
.method public final a(Lob/g;)Lob/v;
    .locals 1

    iget-object v0, p0, Lob/u;->a:Lob/v;

    invoke-static {v0, p1}, Lob/v;->a(Lob/v;Lob/g;)Lob/v;

    move-result-object p1

    return-object p1
.end method
